class Student
{
	int rollNo;
	String name;
	int marks;
    
	Student(int rollNo,String name,int marks)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.marks=marks;
	}
	
   void	setRollNo(int roll)
   {
	   this.rollNo=roll;
   }
   void setName(String nm)
   {
	   this.name=nm;
   }
   void setMarks(int marks)
   {
	   this.marks=marks;
   }
   int getRollNo()
   {
	   return this.rollNo;
   }
   String getName()
   {
	   return this.name;
   }
   void showDetails()
   {
	   System.out.println("Student RollNo="+rollNo+" Name="+name+" Marks="+marks);
   }
}

class Main
{
	public static void main(String args[])
	{
		Student s1=new Student(01,"Ajay",85);
		
		s1.setMarks(90);
		s1.showDetails();
	}
}