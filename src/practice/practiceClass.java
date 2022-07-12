package practice;

import java.util.Arrays;

public class practiceClass {

	public static void main(String[] args) 
	{
		int a1[]= {1,2,3,4,5,6,10};
		int a2[]= {1,2,3,4,5,6,}; 
		boolean value = Arrays.equals(a1, a2);
		if(value==true)
		{
			System.out.println("arrsays are equal");
		}
		else
		{
			System.out.println("array is not equal");
		}
		
//		//sum1=1+2+3+5=11
//		//sum2=1+2+3+4+5=15
//		//sum=sum2-sum1=15-11=4
//		int sum1=0;
//		for(int i=0;i<a.length;i++)//i=0,1,2
//		{
//			sum1=sum1+a[i];//11
//		}
//		System.out.println("value of sum1 is "+sum1);
//		int sum2=0;
//		for(int i=1;i<=5;i++)//i=1,2,3
//		{
//			sum2=sum2+i;//3
//		}
//		System.out.println("value of sum1 is "+sum2);
//		System.out.println("missing no from array "+(sum2-sum1));
		

		
	
		
			
			
		

	}

}

