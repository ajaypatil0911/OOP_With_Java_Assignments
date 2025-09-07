class Staff
{
	String name;
	double salary;
	
	Staff(String name,double salary)
	{
		this.name=name;
		this.salary=salary;
	}
	void display()
	{
	}
}
class TeachingStaff extends Staff
{
	String subject;
	
	TeachingStaff(String name,double salary,String subject)
	{
		super(name,salary);
		this.subject=subject;
	}
	
	void display()
	{
		System.out.println(name+"->"+subject+", "+salary);
	}
}
class NonTeachingStaff extends Staff
{
	String department;
	
	NonTeachingStaff(String name,double salary,String department)
	{
		super(name,salary);
		this.department=department;
	}
	void display()
	{
		System.out.println(name+"->"+department+", "+salary);
	}
}

class Demo
{
	public static void main(String args[])
	{
		Staff t1=new TeachingStaff("Anita",50000,"Math");
		Staff n1=new NonTeachingStaff("Ramesh",40000,"Admin");
		t1.display();
		n1.display();
	}
}