package oops;

public class Employee
{
	int empid;
	String empnum;
	int salary;


public static void main(String[] args)
	{
		//assigning the value of class by using object
		Employee e1=new Employee();// first employee
		e1.empid=101;
		e1.empnum="rahul";
		e1.salary=25000;
		e1.display();
		Employee e2=new Employee();
		e2.empid=102;
		e2.empnum="prashasnt";
		e2.salary=30000;
		e2.display();
		
		
		}
	void display()
	{
		System.out.println(empid);
		System.out.println(empnum);
		System.out.println(salary);
	}

}

