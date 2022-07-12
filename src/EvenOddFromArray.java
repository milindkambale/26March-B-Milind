
public class EvenOddFromArray 
{

	public static void main(String[] args) 
	{
		//to print even and odd no from an array
		int a[]= {1,2,3,5};
////		System.out.println("print odd no in array....... ");
////		for(int i=0;i<a.length;i++)//6
////		{
////			if(a[i]%2!=0)
////			System.out.println(a[i]);//2 4
////		}
//		int min=a[0];
//		for(int i=0;i<a.length;i++)//1,2,3,4--20
//		{
//			if(a[i]<min)
//			{
//				min=a[i];//40,70
//			}
//			
//		}
//		System.out.println("maximum value in array is "+min	);
		//sum1=1+2+3+5=11
		//sum2=1+2+3+4+5=15
		//sum2-sum1=15-11=4
		int sum1=0;
		for(int i=0;i<a.length;i++)//2
			{
			sum1=sum1+a[i];//
			
			}
		System.out.println("sum of element in arrat "+sum1);
		int sum2=0;
		for(int i=1; i<=5;i++)//1,2,3,4,5
		{
			sum2=sum2+i;//1+2=3+3=6+4=10+5=15
			
		}
		System.out.println("sum of range of element in array "+sum2);
		System.out.println("missing no in array "+(sum2-sum1) );
		
//		
		
}
	
	
}

