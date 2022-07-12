package university;

public class ReversePalinDrome {

	public static void main(String[] args)
	{
	int num=2132;
	int rev=0;
	int temp=num;//1331
		
		while(num>0)
	{
			rev=rev*10;//0*10=0,1*10=10,13*10=130,133*10=1330
			rev=rev+num%10;//0+1=1,10+3=13,130+3=133,1330+1=1331
			num=num/10;//133,13,1 ,0
		}
		if(rev==temp)
		{
			System.out.println("palindrome num");
		}
		else
		{
			System.out.println("not p number");
		}
		
	}		
	
	

}
