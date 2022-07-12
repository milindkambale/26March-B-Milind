package oops;

public class Employee1
{
	int empid;
	String empName;
	int empSalary;
	

	public static void main(String[] args) 
	{ 
		Employee1 e =new Employee1();
		e.setdata(105, "aman", 40000);
		e.display();
	}
	void setdata(int id,String Name,int Salary) 
	{
		empid=id;
		empName=Name;
		empSalary= Salary; 
	}
	void display()
{
	System.out.println(empid);
	System.out.println(empName);
	System.out.println(empSalary);
}

}
