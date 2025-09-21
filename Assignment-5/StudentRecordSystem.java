import java.util.*;
class Student
{
	String name;
	String grade;
	
	Student(String name,String grade)
	{
		this.name=name;
		this.grade=grade;
	}
	
	public String toString()
	{
		return name+":"+grade;
	}
}
class Demo
{
	public static void main(String args[])
	{
		List<Student> list=new ArrayList<>();
		list.add(new Student("Amit","A"));
		list.add(new Student("Priya","B"));
		
		System.out.println("Student Records:"+list);
	}
}
