package practice;

public class FibonacciSeries {

	public static void main(String[] args)
	{
		int a=0,b=1,c=0;
				System.out.print (a+" "+b);
		for(int i=2;i<=10;i++)
		{
			c=a+b;//1,2
			System.out.print(" "+c);//1,2
			a=b;//b=1,a=1
			b=c;//c=1,b=1
		}

	}

}
