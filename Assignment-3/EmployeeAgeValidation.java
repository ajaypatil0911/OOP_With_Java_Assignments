class Employee
{
	private int age;
	
	void setAge(int age)
	{
		if(age>=18)
		{
			this.age=age;
		}
		else
			System.out.println("Invalid age");
	}
	int getAge()
	{
		return age;
	}
	
}
class Checkage
{
	public static void main(String args[])
	{
		Employee e1=new Employee();
		e1.setAge(17);
		//System.out.println(e1.getAge());
	}
}