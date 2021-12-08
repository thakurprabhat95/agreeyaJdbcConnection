package com.day3;

public class ConstructorOverloadingExample {
	
	double width,height,depth;
	
	 ConstructorOverloadingExample(double h,double w,double d) {
		 
		 width=w;
		 height=h;
		 depth=d;
		 
		 
		 
	}
	 //constructor used when rectangle is used
	 ConstructorOverloadingExample(double h,double w)
	 {
		 height=h;
		 width=w;
	 }
	 
	 //constructor used when cube is used
	 ConstructorOverloadingExample(double len)
	 {
		 width=height=width=len;
	 }
	 
	 //default constructor
	 ConstructorOverloadingExample()
	 {
		 
	 }
	 
	 //compute and return volume
	 double volumeOfBox()
	 {
		 return width*height*depth;
	 }
	 

	 public static void main(String[] args) {
		 
		 //create different type of dimensions by using various constructors
		ConstructorOverloadingExample constructorOverloadingExample=new ConstructorOverloadingExample();
		ConstructorOverloadingExample constructorOverloadingExample2=new ConstructorOverloadingExample(12,13,14);
		ConstructorOverloadingExample constructorOverloadingExample3=new ConstructorOverloadingExample(13,89);
		ConstructorOverloadingExample constructorOverloadingExample4=new ConstructorOverloadingExample(12);
		
		//get volume of first 
		double volume=constructorOverloadingExample2.volumeOfBox();
		System.out.println("Volume of cuboid is..."+volume);
		
		double volumeOfBox = constructorOverloadingExample3.volumeOfBox();
		System.out.println("volume of second box is.. "+volumeOfBox);
		
	}
}

