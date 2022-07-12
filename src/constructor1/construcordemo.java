package constructor1;

public class construcordemo
{
		String firstname, lastname;
		int age;
		char maleorfemale;
		construcordemo(String a,String b,int c,char d)
		{
			firstname=a;
			lastname=b;
			age=c;
			maleorfemale=d;
			System.out.println(firstname+" "+lastname);
			System.out.println(age);
			System.out.println("my Gender is "+maleorfemale);
			
			
		}

	public static void main(String[] args) {
		construcordemo f=new construcordemo("milind", "kamble", 26, 'M');
		construcordemo g=new construcordemo("prashant", "khillu", 22, 'M');

	}

}
