package practice;

public class PalindromeNumber {

	public static void main(String[] args) 
	{
	int num=121;
	int rev=0;
	int temp=num;
	while(num>0)
	{
		rev=rev*10;
		rev=rev+num%10;
		num=num/10;
	}
	if(rev==temp)
	{
		System.out.println("Above number is palindrome number");
	}
	else
	{
		System.out.println(" above number is not palindrome number");
	}
		

}
	
}
