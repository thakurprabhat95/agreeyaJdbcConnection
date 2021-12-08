package com.oopconcept;

import java.util.ArrayList;
import java.util.List;
abstract  class StaffMember
{
	protected String name;
	protected String address;
	protected String phone;
	public StaffMember(String name,String address,String phone) {
		
		this.name=name;
		this.address=address;
		this.phone=phone;
	}
	 @Override
	   public String toString() {
	      return "StaffMember{" +
	          "name='" + name +""+
	          ", address='" + address + "" +
	          ", phone='" + phone + ""+
	          '}';
	
}
	  abstract double earnings();
}

class Employee extends StaffMember
{
	protected String empId;
	protected double rate;
	Employee(String name,String address,String phone,String empId,double rate)
	{
		super(name,address,phone);
		this.empId=empId;
		this.rate=rate;
	}
	@Override
	   public String toString() {
	      return "Employee{" +
	         "empId='" + empId + "" +
	         ", rate=" + rate +
	         super.toString() +
	         '}';
	   }
	@Override
	double earnings() {
		return rate;
	}
}

class Apprentice extends StaffMember
{
	public Apprentice(String name,String address,String phone) {
		super(name,address,phone);
	}

	@Override
	double earnings() {
		
		return 0.0;
	}
	public String toString()
	{
		return super.toString();
	}
}

class ExcecutiveEmployee extends Employee
{
	private double bonus;
	public ExcecutiveEmployee(String name,String address,String phone,String empId,double rate) {
		super(name,address,phone,empId,rate);
		this.bonus=0;
	}
	


	public void bonusRecieved(double bonus)
	{
		this.bonus=bonus;
	}
	public double earnings()
	{
		return super.earnings()+bonus;
	}
	
	@Override
	   public String toString() {
	      return "ExecutiveEmployee{" +
	         "bonus=" + bonus + super.toString()+
	         '}';
	   }
}

class RegularEmployee extends Employee
{
	private int hoursWorked;
	
	public RegularEmployee(String name,String address,String phone,String empId,double rate) {
		super(name,address,phone,empId,rate);
		hoursWorked=0;
		
	}
	
	public void updateHours(int hours)
	{
		hoursWorked=hoursWorked+hours;
	}
	
	public double earnings()
	{
		return rate*hoursWorked;
	}
	
	@Override
	public String toString() {
		return "RegularEmployee{"+"hoursWorked="+hoursWorked+super.toString();
	}
}
class Staff
{
	 List<StaffMember> staffMembers=new ArrayList<>();
	Staff()
	{
	staffMembers.add(new ExcecutiveEmployee("Mickey","Disney Land","1234","987654321",1236.56));
	staffMembers.add(new Employee("Donald","Disney Land","2233","87459985",5603.48));
	staffMembers.add(new RegularEmployee("Zairo","Disney Land","2244","87452658",12.36));
	staffMembers.add(new Apprentice("Minnie","Disney Land","963258741"));
	
	  ((ExcecutiveEmployee)staffMembers.get(0)).bonusRecieved(1200);
	  ((RegularEmployee)staffMembers.get(2)).updateHours(5);
}
	
	 public void pay(){
	      for(StaffMember m: staffMembers){
	         System.out.println(m.toString());
	         System.out.println("Earnings: "+ m.earnings());
	         System.out.println("------------------------------");
	      }
	   }
}
 class InheritenceExample {
	public static void main(String[] args) {
		
		Staff staff=new Staff();
		staff.pay();
		
	}
}
  

