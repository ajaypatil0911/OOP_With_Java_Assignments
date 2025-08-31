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
  
   
   String calculateGrade()
   {
	   if(marks>=80)
		   return "A";
	   else if(marks>=60&&marks<80)
		   return "B";
	   else if(marks>=40&&marks<60)
		   return "C";
	   else return "Fail";
   }
   void showDetails()
   {
	   System.out.println("Student RollNo="+rollNo+", Name="+name+", Marks="+marks+", Grade="+calculateGrade());
   }
   
}

class Main
{
	public static void main(String args[])
	{
		Student s1=new Student(11,"Ajay",85);
		Student s2=new Student(22,"Patil",75);
		
		s1.showDetails();
		s2.showDetails();
	}
}