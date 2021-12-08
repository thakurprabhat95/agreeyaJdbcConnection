//java program to explain the use of conditional operator
package com.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConditionalOperatorExample {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//int firstNumber=10,secondNumber=20,largestNumber;
		
		//taking input from user using bufferedReader
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first number");
	
		int firstNumber=Integer.parseInt(bufferedReader.readLine());
		System.out.println("enter second number");
		int secondNumber=Integer.parseInt(bufferedReader.readLine());
		
		
		//find largest among two numbers
		int largestNumber=(firstNumber>secondNumber)? firstNumber:secondNumber;
		
		System.out.println("Largest Number among two numbers using BufferedReader class.."+largestNumber);
		
		
		//scanner definition
		Scanner scanner=new Scanner(System.in);
		
		//taking input from user
	
		System.out.println("Enter first number...");
	   int firstNum=scanner.nextInt();
	   
       System.out.println("ENter the second number..");
       int secondNum=scanner.nextInt();
       
       System.out.println("Enter the third number...");
       int thirdNum=scanner.nextInt();
       
       //largest among three numbers
     int  largestNum=(firstNum>secondNum)? (firstNum>thirdNum?firstNum:thirdNum) :(secondNum>thirdNum?secondNum:thirdNum);
       
       //print the largest among numbers
       
       System.out.println("Largest among three numbers..." +firstNum +","+secondNum+"and"+thirdNum+"is..."+largestNum);
       
	}

}
