package com.oopconcept;

class GrandParent
{
	void print()
	{
		System.out.println("GrandParent's print()...");
		
	}
	void eating()
	{
		System.out.println("GrandParent is eating...");
	}
}
class Parent extends GrandParent
{
	void print()
	{
		super.print();
		System.out.println("Parent's print()...");
	}
}
class child extends Parent
{
	void print()
	{
		super.print();
		super.eating();
		System.out.println("child's print()...");
	}
}
public class SuperKeywordExample3 {
	public static void main(String[] args) {
		GrandParent child=new child();
		child.print();
	}

}
