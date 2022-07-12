package InterfaceStudy;

public interface mother 
{
	void love();
	default void nature()
	{
		System.out.println("mother");
	}
	static void test()
	{
		System.out.println("static method for mother");
	}
}
