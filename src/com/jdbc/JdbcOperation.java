package com.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcOperation {
	
	int registerNo;
    String name;
    String emailid;
    
    Connection connection=null;
    PreparedStatement preparedStatement=null;
    
    StudentRegisteration studentRegisteration=new StudentRegisteration();
    InputStreamReader datas=new InputStreamReader(System.in);
    BufferedReader buff=new BufferedReader(datas);
    void getData() throws IOException {
        System.out.println("Enter the Name ");
        name=buff.readLine();
        studentRegisteration.setName(name);
        System.out.println("Enter the Email id");
        emailid=buff.readLine();
        studentRegisteration.setEmailid(emailid);
        System.out.println("Enter the Register No");
        registerNo=Integer.parseInt(buff.readLine());
        studentRegisteration.setRegisterNo(registerNo);
    }

    void InsertTheData() throws ClassNotFoundException, SQLException
    {
    	
        Connection c1 = ConnectionClass.getConnection(ConfigFile.URLACCESS,ConfigFile.USERNAME,ConfigFile.PASSWORD);
        PreparedStatement preparedStatement=c1
                .prepareStatement("insert into registerNo (registerNo,name,emailid) values(?,?,?)");
        preparedStatement.setInt(1,studentRegisteration.getRegisterNo());
        preparedStatement.setString(2,studentRegisteration.getName());
        preparedStatement.setString(3,studentRegisteration.getEmailid());
        int result=preparedStatement.executeUpdate();
        if(result>0)
        {
            System.out.println("Inserted Successfully");
        }
        else
        {
            System.out.println("Error In Insertion");
        }


    }



    void ReteriveRecords() throws ClassNotFoundException
    {
        try{
        	 Connection con = ConnectionClass.getConnection(ConfigFile.URLACCESS,ConfigFile.USERNAME,ConfigFile.PASSWORD);
                PreparedStatement ps=con.prepareStatement("select registerNo,name,emailid from registerNo");
           ResultSet resultSet= ps.executeQuery();
           while(resultSet.next())
           {
               System.out.println(" Register No "+resultSet.getInt(1));
               System.out.println(" Name "+resultSet.getString(2));
               System.out.println(" Emailid "+resultSet.getString(3));
           }
        }

        catch (SQLException sqlException)
        {
            System.out.println("Error in SQL ");
        }



    }

    void getStudentInfoBasedOnCondition() throws IOException,ClassNotFoundException,SQLException
    {
        System.out.println("Enter the Serial No ");
        int val1=Integer.parseInt(buff.readLine());
        Connection c1 = ConnectionClass.getConnection(ConfigFile.URLACCESS,ConfigFile.USERNAME,ConfigFile.PASSWORD);
        PreparedStatement preparedStatement=c1.prepareStatement("select registerNo,name,emailid from registerNo where sno=? ");
        preparedStatement.setInt(1,val1);
        ResultSet resultSet=preparedStatement.executeQuery();
        while(resultSet.next())
        {
            System.out.println(" Register No "+resultSet.getInt(1));
            System.out.println(" Name "+resultSet.getString(2));
            System.out.println(" Emailid "+resultSet.getString(3));
        }

    }
    void getStudentInfo() throws IOException,ClassNotFoundException,SQLException
    {


    	 Connection c1 = ConnectionClass.getConnection(ConfigFile.URLACCESS,ConfigFile.USERNAME,ConfigFile.PASSWORD);
            PreparedStatement preparedStatement=c1.prepareStatement("select sno,name,emailid,registerNo from registerNo ");
        ResultSet resultSet=preparedStatement.executeQuery();
        while(resultSet.next())
        {
            System.out.println(" *******++++******************************************++++++*****");
            System.out.println(" ******* Reterive Student Record Started *****");
            System.out.println(" Serial No "+resultSet.getInt(1));
            System.out.println(" Register No "+resultSet.getString(2));
            System.out.println(" Name "+resultSet.getString(3));
            System.out.println(" Emailid "+resultSet.getInt(4));
            System.out.println(" ******* Reterive Student Record Ended *****");
        }

    }
    void DeleteRecords() throws ClassNotFoundException
    {
        try{
            System.out.println("Enter the Register Number u Want to Delete ");
            int id=Integer.parseInt(buff.readLine());
            Connection c1 = ConnectionClass.getConnection(ConfigFile.URLACCESS,ConfigFile.USERNAME,ConfigFile.PASSWORD);
              PreparedStatement preparedStatement=c1.prepareStatement("delete from registerNo where registerNo=?");
            preparedStatement.setInt(1,id);
           int i= preparedStatement.executeUpdate();
           System.out.println("value of i is.."+i);
           if(i>0)
           {
               System.out.println("Successfully Deleted");
           }
           else
           {
               System.out.println("Error in Deletion");
           }
        }
        catch(IOException ioException)
        {
            System.out.println("Input type Mismatching");
        }
        catch (SQLException sqlException)
        {
            System.out.println("Error in SQL");
        }

    }
    public void UpdateRecords() throws IOException, ClassNotFoundException,SQLException
    {

        System.out.println("Enter the Serial Number of Student u Want to Update ");
        int s=Integer.parseInt(buff.readLine());
        System.out.println("Enter the Name u want to change");
        name=buff.readLine();
        System.out.println("Enter the Email id u want to change");
        emailid=buff.readLine();
        System.out.println("Enter the Register No u want to change");
        registerNo=Integer.parseInt(buff.readLine());
        
        
        Connection c1 = ConnectionClass.getConnection(ConfigFile.URLACCESS,ConfigFile.USERNAME,ConfigFile.PASSWORD);
          PreparedStatement preparedStatement=c1.prepareStatement("update registerNo set registerNo=?,name=?,emailid=? where sno=?");
          
        preparedStatement.setInt(4,registerNo);
        preparedStatement.setString(2,name);
        preparedStatement.setString(3,emailid);
        preparedStatement.setInt(1,s);
        int val=preparedStatement.executeUpdate();
        if(val>0)
        {
            System.out.println("Update Successfully");
        }
        else
        {
            System.out.println("Error in Updation");
        }
    }
    void getUserRequest() throws IOException,ClassNotFoundException,SQLException
    {
        System.out.println("1.Insert\n2.Delete\n3.Reterive Based on Condition\n4.Update\n5.Reterive Records");
        System.out.println("Enter Your Choice ");
        int choice=Integer.parseInt(buff.readLine());
        switch (choice)
        {
            case 1:
                this.getData();
                this.InsertTheData();
                this.getStudentInfo();
                break;
            case 2:
                this.DeleteRecords();
                this.getStudentInfo();
                break;
            case 3:
                this.getStudentInfoBasedOnCondition();
                this.getUserRequest();
                break;
            case 4:
                this.UpdateRecords();
                this.getStudentInfo();
                break;
            case 5:
                this.getStudentInfo();
                break;
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException,SQLException{
    	JdbcOperation jop=new JdbcOperation();
        jop.getUserRequest();
    }

}
