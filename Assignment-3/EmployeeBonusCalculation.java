abstract class Employee
{
	String name;
	double salary;
	abstract void calculateBonus();
	Employee(String name,double salary)
	{
		this.name=name;
		this.salary=salary;
	}
}
class Manager extends Employee
{
	int bonus;
	Manager(String name,double salary)
	{
		super(name,salary);
		this.bonus=20;
	}
	void calculateBonus()
	{
		double temp=salary*bonus/100;
		System.out.println(name+" Bonus="+temp);
	}
}
class Developer extends Employee
{
	int bonus;
	Developer(String name,double salary)
	{
		super(name,salary);
		this.bonus=10;
	}
	void calculateBonus()
	{
		double temp=salary*bonus/100;
		System.out.println(name+" Bonus="+temp);
	}
}
class Demo
{
	public static void main(String args[])
	{
		Employee e1=new Manager("Ajay",50000);
		Employee e2=new Developer("Rahul",40000);
		e1.calculateBonus();
		e2.calculateBonus();
	}
}