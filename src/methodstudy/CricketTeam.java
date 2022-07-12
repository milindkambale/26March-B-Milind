package methodstudy;

public class CricketTeam {

	public static void main(String[] args) { 
		CricketTeam CT=new CricketTeam();//created object of non-static method
		CT.CricketTeam("D VILLER", 8, 36.8F, 'A', "AUS");
		CT.CricketTeam("DINESH KARTIK", 12, 38.8F, 'A', "INDIA");
		
		
	
	

	}
	
	public void CricketTeam(String name,int num, float age,char avg,String team)
	{
		System.out.println("===========");
		System.out.println("player name is "+name);
		System.out.println("player number is "+num);
		System.out.println("player age is "+age);
		System.out.println("player avg is "+avg);
		System.out.println("player team is "+team);
		System.out.println("=======================");
	}

}
