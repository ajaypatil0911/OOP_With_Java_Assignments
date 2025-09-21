import java.util.*;
class Employee implements Comparable<Employee>
{
	String name;
	int salary;
	
	Employee(String name,int salary)
	{
		this.name=name;
		this.salary=salary;
	}
	
	public String toString()
	{
		return name+":"+salary;
	}
	@Override
	public int compareTo(Employee o)
	{
		return this.salary-o.salary;
	}
}
class Demo
{
	public static void main(String args[])
	{
		List<Employee> list= new ArrayList<>();
		
		list.add(new Employee("Amit",50000));
		list.add(new Employee("Priya",60000));
		list.add(new Employee("Rohan",45000));
		
		Collections.sort(list);
		
		System.out.println(list);
		
	}
}