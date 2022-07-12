package InterfaceStudy;

public interface aunty 
{
	void care();
	default void home()
	{
		System.out.println("home method from aunty");
	}
	static void property()
	{
		System.out.println("property method from aunty");
	}

}
