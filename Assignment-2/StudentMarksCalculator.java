class Student
{
	String name;
	int marks;
	static int totalStudents;
	
	Student(String nm,int mar)
	{
		this.name=nm;
		this.marks=mar;
		totalStudents++;
	}
	void setName(String nm)
	{
		this.name=nm;
	}
	void setMarks(int mar)
	{
		this.marks=mar;
	}
	String getName()
	{
		return this.name;
	}
	int getMarks()
	{
		return this.marks;
	}
	
	boolean isPassed()
	{
		if(this.marks>=35)
			return true;
		else
			return false;
	}
	static void showTotalStudents()
	{
		System.out.println("Total Students:"+totalStudents);
	}
}

class Main
{
	public static void main(String args[])
	{
		Student s1=new Student("Rahul",78);
		Student s2=new Student("Pooja",34);
		Student s3=new Student("Amit",65);
		
		System.out.println("Student "+s1.name+" Passed?"+s1.isPassed());
		System.out.println("Student "+s2.name+" Passed?"+s2.isPassed());
		System.out.println("Student "+s3.name+" Passed?"+s3.isPassed());
		Student.showTotalStudents();
	}
}