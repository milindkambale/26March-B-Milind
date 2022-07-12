package InterfaceStudy;

public interface father
{
	default void nature()
	{
		System.out.println("father");
	}
	void money ();
	static void test()
	{
		System.out.println("static method for father");
	}
}
	
