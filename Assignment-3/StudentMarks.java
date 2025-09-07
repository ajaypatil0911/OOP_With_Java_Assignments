class Student
{
	private int marks;
	
	void setMarks(int marks)
	{
		if(marks>=0&&marks<=100)
		{
			this.marks=marks;
		}
		else
			System.out.println("marks must between 0-100");
	}
	int getMarks()
	{
		return this.marks;
	}
}
class Demo
{
	public static void main(String args[])
	{
		Student s1=new Student();
		s1.setMarks(85);
		System.out.println("Marks="+s1.getMarks());
	}
}