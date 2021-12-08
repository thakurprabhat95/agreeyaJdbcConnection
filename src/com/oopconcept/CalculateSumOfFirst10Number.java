package com.oopconcept;

import java.math.BigInteger;
import java.util.Scanner;

public class CalculateSumOfFirst10Number {
	
	//calculate sum of first 10 natural numbers
	static void calculateSumofFirst10(int n)
	{
		int sum = 0;

		for (int i = 0; i <= n; i++) {
			sum = sum + i;

		}
		System.out.println(sum);
	}
	
	//multiplication table of any number entered by user
	static void multiplicationTable()
	{
		Scanner scanner=new Scanner(System.in);
	 System.out.println("Enter any positive integer..");
	 int number=scanner.nextInt();
	 
	 System.out.println("Multiplacation Table of "+number+" "+ "is..");
	 for(int i=1;i<=10;i++)
	 {
		 System.out.println(number +"X" + i+"="+(number*i));
	 }
	 scanner.close();
	}
	
	
	//find sum of series with cubes of first n natural numbers
	
	public static int sumOfSeries(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i*i*i;
			
		}
		return sum;
	}
	
	//find the sum of the first n  natural numbers  when n is very large
	
	static BigInteger sum(String n)
	{
		//b1=1
		BigInteger b1=BigInteger.ONE;
		BigInteger b2=BigInteger.TWO;
		
		// Converting n to BigInteger
        BigInteger bigInt = new BigInteger(n);
  
        // Calculating (n * (n + 1)) / 2
        BigInteger result =
         (bigInt.multiply(bigInt.add(b1))).divide(b2);
        return result;
	}
	
	//find factorial of number
	
	static int factorial(int n)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number to find factorial...");
		int number=scanner.nextInt();
	
		int factorial=1;
		
		for(int i=1;i<=number;i++)
		{
			factorial=factorial*i;
		}
		
		scanner.close();
		return factorial;

		
	}

	public static void main(String[] args) {

	calculateSumofFirst10(10);
	multiplicationTable();
	System.out.println("\n sum of series is.."+sumOfSeries(5));
	
	String n="12345678910";
	
	System.out.println("Sum of large number is.."+sum(n));
	
	System.out.println("factorial of enterd number is..." +factorial(6));

	}
}
