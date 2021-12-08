package com.oopconcept;


class Person
{
	int id;
	String name;
	
 Person(int id,String name)
 {
	 this.id=id;
	 this.name=name;
 }
	
}

class Student extends Person
{
	float salary;
	Student(int id, String name,float salary) {
		super(id, name);//reusing parent constructor
		this.salary=salary;
	}
	
	
void display()
{
	System.out.println("id is.."+id+"name is.."+name+"salary is.."+salary);
}

}


public class SuperKeywordExample2 {
	public static void main(String[] args) {
		
	
	
	Student st=new Student(1, "prabhat", 123f);
    st.display();

}
}
