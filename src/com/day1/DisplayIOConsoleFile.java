//java program to explain the concept of IO console file approach with suitable throwing an exception
package com.day1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DisplayIOConsoleFile {

	public static void main(String[] args) throws IOException {
		
		try {
			FileReader fileReader=new FileReader("D:/Training_Java_Assignment/reader.txt");
			BufferedReader bufferedReader=new BufferedReader(fileReader);
			
			//to perform the read operation we need to do the following
			while(bufferedReader.ready())
			{
				System.out.println(bufferedReader.readLine());
			}
			bufferedReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		

	}

}
