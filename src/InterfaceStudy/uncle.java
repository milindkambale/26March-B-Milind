package InterfaceStudy;

public interface uncle 
{
	void shine();
	default void home()
	{
		System.out.println("home method from uncle");
	}
	 static void property()
	 
	 {
		 System.out.println("property method from uncle");
	 }

}
