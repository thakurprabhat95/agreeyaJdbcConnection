package com.day2;

public class Exception1  {
	
	static int createArray(int arr[])
	{
		int array[]= {12,14,89,89};
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[6]);
		}
		return 1;
	}

	static String throwNullPointerException()
	{
		String string=null;
		return string;
	}
	
	public static void main(String[] args) {

		int a = 10, b = 0;
		int arr[]= {12,14,89,89};

		try {
		
			System.out.println("first try-block...");
			System.out.println(a/b);	
		} 
		finally {
			System.out.println("always executed..");
		}
		
		try {
			throwNullPointerException();	
		} 
		finally {
			System.out.println("always executed..");
		}
		try
		{
			System.out.println("excecuted second try-block");
			createArray(arr);
		}
		finally {
			System.out.println("always executed..");
		}
	
		

	}

}
