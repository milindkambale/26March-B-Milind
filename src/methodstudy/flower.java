package methodstudy;

public class flower 
{ 
	String colour;
	int age;
	void intObj(String c,int a)
	{ 
		colour=c;
		age=a;
	}
	void display()
	{
		System.out.println(colour +" " +age);
	}
	

	public static void main(String[] args)
	{
		flower rose=new flower();
		rose.intObj("red", 10);
		rose.display();

	}

}
