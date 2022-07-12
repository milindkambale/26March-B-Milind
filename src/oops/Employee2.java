package oops;

public class Employee2 
{
	int empid;
	String empname;
	int empsalary;

	public static void main(String[] args)
	{
		Employee2 e=new Employee2(107, "rahul", 30000);
		e.display();
				
	}
	 Employee2(int id,String name,int salary)
	{
		empid=id;
		empname=name;
		empsalary=salary;
	}
		void display()
		{
			System.out.println(empid);
			System.out.println(empname);
			System.out.println(empsalary);
		}
		
		
		
	}

 
