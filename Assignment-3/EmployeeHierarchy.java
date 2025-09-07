class Employee
{
	String name;
	double basicSalary;
	
	Employee(String name,double basicSalary)
	{
		this.name=name;
		this.basicSalary=basicSalary;
	}
}
class RegularEmployee extends Employee
{
	int hra;
	
	RegularEmployee(String name,double basicSalary)
	{
		super(name,basicSalary);
		//this.name=name;
		//this.basicSalary=basicSalary;
		this.hra=10;
	}
	void display()
	{
		double temp=basicSalary*hra/100;
		double netSal=basicSalary+temp;
		System.out.println(name+" Net Salary="+netSal);
	}
}
class ContractEmployee extends Employee
{
	int allowance;
	
	ContractEmployee(String name,double basicSalary)
	{
		super(name,basicSalary);
		//this.name=name;
		//this.basicSalary=basicSalary;
		this.allowance=5;
	}
	void display()
	{
		double temp=basicSalary*allowance/100;
		double netSal=basicSalary+temp;
		System.out.println(name+" Net Salary="+netSal);
	}
}
class Demo
{
	public static void main(String args[])
	{
		RegularEmployee r1=new RegularEmployee("Ajay",20000);
		ContractEmployee c1=new ContractEmployee("Rahul",15000);
		r1.display();
		c1.display();
	}
}
