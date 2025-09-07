class Employee
{
	String name;
	double salary;
	
	Employee(String name,double salary)
	{
		this.name=name;
		this.salary=salary;
	}
	void displaySalary()
	{
		System.out.println(name+" Total Salary="+salary);
	}
}
class Manager extends Employee
{
	Manager(String name,double salary)
	{
		super(name,salary);
	}
	
	void displaySalary()
	{
	    double bonus=salary*20/100;
		salary=salary+bonus;
		System.out.println(name+" Total Salary="+salary);
	}
}
class Developer extends Employee
{
	Developer(String name,double salary)
	{
		super(name,salary);
	}
	void displaySalary()
	{
		double bonus=salary*10/100;
		salary=salary+bonus;
		System.out.println(name+" Total Salary="+salary);
	}
	
}

class Demo
{
	public static void main(String args[])
	{
		Employee e1=new Manager("Anita",50000);
		Employee e2=new Developer("Rohit",40000);
		e1.displaySalary();
		e2.displaySalary();
	}
}