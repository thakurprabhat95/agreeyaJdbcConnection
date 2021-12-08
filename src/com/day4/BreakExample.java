package com.day4;

public class BreakExample {
	public static void main(String[] args) {
		
		
		
	
	NumberFormatException num=new NumberFormatException();
//	for(int i=1;i<=2;i++)
//	{
//		for(int j=0;j<=3;j++)
//		{
//			if(j==2)
//			{
//				break;
//			}
//			System.out.println(j);
//		}
//	}
	double[] marks= {12.4,12,16,89};
	System.out.println("The length of array is.."+marks.length);
	float average[]= {12,12,12};
	System.out.println("the length of the array is..."+average.length);

	
	xy:  
		for(int i=1;i<=5;i++){    
		pq:  
		for(int j=1;j<=5;j++){    
		                        if(i==3 && j==3){
		                            continue xy;    
		                        }    
		System.out.println(i+" "+j);    
		                    }    
		            }    
		} 
}
