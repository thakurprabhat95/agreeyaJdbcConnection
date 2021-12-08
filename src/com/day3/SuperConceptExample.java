package com.day3;


class Vehicle
{
	int maxSpeed=120;
	
	//use of super with methods
	void message()
	{
		System.out.println("This is Parent class..");
	}
}
public class SuperConceptExample extends Vehicle{
	
	//use of super with variables
	int maxSpeed=180;
	
	void message()
	{
		System.out.println("This is child class...");
	}
	void display()
	{
		System.out.println("display method..");
		//System.out.println("MAximum speed:"+super.maxSpeed);
		System.out.println("maximum speed without using super:"+maxSpeed);//it prints maxSpeed=180
		System.out.println("maximum speed using super:"+super.maxSpeed);//it prints maxSpeed=120
		super.message();
		
	}
	


}
