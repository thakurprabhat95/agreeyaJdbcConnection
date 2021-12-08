package com.oopconcept;


class Animal
{
	String color="white";
	void eat()
	{
		System.out.println("Animal is eating..");
	}
	
	Animal()
	{
		System.out.println("animal constructor is created....");
	}
}
class Dog extends Animal
{
	String color="black";

	
	void eat()
	{
		System.out.println("Dog is eating..");
	}
	void bark()
	{
		System.out.println("barking...");
	}
	
	void printData()
	{
		System.out.println(color);// "black"-->it prints the color of class Animal
		System.out.println(super.color);//"white"--->it prints the color of Dog class
		eat();//it will print method of dog class
		super.eat();//it will print eat method of animal class
		
	}
	
	Dog()
	{
		super();
		System.out.println("Dog constructor is created...");
		
	}
}

public class SuperKeywordExample {
	
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.printData();
	
	
		
	}

}

//In the above example, 
//Animal and Dog both classes have a common property color. 
//If we print color property, it will print the color of current class by default. 
//To access the parent property, we need to use super keyword.
