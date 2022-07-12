package InterfaceStudy;

public class son implements father,mother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		son s=new son();
		s.love();
		s.money();
		s.nature();
		father.test();
		mother.test();

	}

	@Override
	public void love() 
	{
		System.out.println("abc");
		
	}

	@Override
	public void nature() 
	{
		
		father.super.nature();
		mother.super.nature();
	
		
	}

	@Override
	public void money()
	{
	
	
		System.out.println("rew");
		
	}

	

}
