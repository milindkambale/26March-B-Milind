package method_overriding;

public class testOverriding {

	public static void main(String[] args) 
	{
		parentClass p=new parentClass();
		p.battery();
		p.camera();
		parentClass obj=new childClass();
		obj.battery();
		obj.camera();
		childClass c=new childClass();
		c.battery();
		c.camera();
		

	}

}
