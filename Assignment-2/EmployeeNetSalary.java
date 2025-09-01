class Employee
{
	int id;
	String name;
	double basicSalary;
	
	static int counter=1001;
	
	Employee()
	{
		this.id=counter++;
		this.name="Unknown";
		this.basicSalary=20000;
	}
	
	Employee(String name,double basicSalary)
	{
		this.id=counter++;
		this.name=name;
		this.basicSalary=basicSalary;
		counter++;
	}
	
	int getid()
	{
		return this.id;
	}
	String getName()
	{
		return this.name;
	}
	double getBasicSalary()
	{
		return this.basicSalary;
	}
	
	
	double calculateNetSalary()
	{
		double hra=0.10*basicSalary;
		double da=0.05*basicSalary;
		double pf=0.02*basicSalary;
		return basicSalary+hra+da-pf;
	}
	
	
	void showDetail()
	{
		System.out.println("Employee ID="+getid()+", Employee Name="+getName()+", Basic Salary="+calculateNetSalary());
	}
	
	
}

class Main
{
	public static void main(String args[])
	{
		Employee e1=new Employee();
		Employee e2=new Employee("Ajay",50000);
		e1.showDetail();
		e2.showDetail();
	}
}