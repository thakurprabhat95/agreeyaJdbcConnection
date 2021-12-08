package com.oopconcept;


class parent1

{

int registerNo;

String name;

 

parent1(int registerNo,String name)

{

this.registerNo=registerNo;//666

this.name=name;//vinoth kumar
this.printInfo();

}

 

void printInfo()

{

System.out.println("Register Number "+registerNo);

System.out.println("name "+name);

}

}



class child1 extends parent1

{

String fatherName;

String MotherName;

 

child1(int r,String n,String fatherName,String MotherName)

{

super(r,n);

this.fatherName=fatherName;

this.MotherName=MotherName;
super.printInfo();

}

 

void printInfo1()

{

 

System.out.println("Father Name "+fatherName);

System.out.println("Mother Name "+MotherName);

}

}

 



class MultilevelPgm extends child1{

String emailid;

String Address;

MultilevelPgm(int r,String n,String fn,String mn,String emailid,String Address)

{

super(r,n,fn,mn);//Should Be the first Statement in the program

this.emailid=emailid;

this.Address=Address;
super.printInfo1();

}

 

void printInfo2()

{

 

System.out.println("emailid "+emailid);

System.out.println("Address "+Address);


}

 
}
 

public class SuperKeywordExample4
{

public static void main(String[] args) {

MultilevelPgm mlp=new MultilevelPgm(666,"Vinothkumar Selvaarasan","Selvaarasan","Nagalakshmi","vinchi.frnds@gmail.com","Chennai");

}

}
 
