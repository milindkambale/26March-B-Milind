package InterfaceStudy;

public class brothers implements uncle,aunty
{

		
	
	public static void main(String[]args)
	{
		brothers b=new brothers();
		b.care();
		b.shine();
		b.home();
		aunty.property();
		uncle.property();
		
	}

	@Override
	public void care() 
	{
		System.out.println("aunty method");
		
		
	}

	@Override
	public void shine() 
	{
		System.out.println("uncle property");
		
		
	}

	@Override
	public void home() {
		
		aunty.super.home();
		uncle.super.home();
	}
}
