class Employee
{
	String name;
	double salary;
	int yearsOfService;
	static int totalEmployees;
	
	Employee(String nm,double sal,int yrofserv)
	{
		this.name=nm;
		this.salary=sal;
		this.yearsOfService=yrofserv;
		totalEmployees++;
	}
	
	void setName(String nm)
	{
		this.name=nm;
	}
	void setSalary(double sal)
	{
		this.salary=sal;
	}
	void setYearsOfService(int yr)
	{
		this.yearsOfService=yr;
	}
	String getName()
	{
		return this.name;
	}
	double getSalary()
	{
		return this.salary;
	}
	int getYearsOfService()
	{
		return this.yearsOfService;
	}
	double calculateBonus()
	{
		double temp;
		if(this.yearsOfService>5)
		{
			temp=this.salary*5/100;
			return temp;
		}
		else
			return 0;
	}
	static void showTotalEmployees()
	{
		System.out.println("Total Employees:"+totalEmployees);
	}
}

class Main
{
	public static void main(String args[])
	{
		Employee e1= new Employee("Ravi",150000,6);
		Employee e2= new Employee("Anita",120000,3);
		Employee e3= new Employee("Suresh",100000,5);
		
		System.out.println("Employee "+e1.name+" Bonus:"+e1.calculateBonus());
		System.out.println("Employee "+e2.name+" Bonus:"+e2.calculateBonus());
		System.out.println("Employee "+e3.name+" Bonus:"+e3.calculateBonus());
		Employee.showTotalEmployees();
		}
}