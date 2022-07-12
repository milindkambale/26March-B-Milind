package Constructor;

public class company
{
	String name,dept;
	int id;
	company(String a,String b,int c)
	{
		name=a;
		dept=b;
		id=c;
		System.out.println("my name is "+name);
		System.out.println("my dept is "+dept);
		System.out.println("my id is "+id);
		System.out.println("===============");
	}

	public static void main(String[] args) 
	{
//		company c=new company();
//		 c.tester("milind", "qa", 10);
//		c.tester("kuldip", "pm", 25);
//		c.tester("amar", "dv", 50);
//		company c=new company("prashya", "production", 70);
		System.out.println(company.class.getSuperclass());
		
	
		

	}

}
