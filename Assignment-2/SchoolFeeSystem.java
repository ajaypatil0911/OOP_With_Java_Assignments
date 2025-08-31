class Student
{
	String name;
	String className;
	static int tuitionFee;
	
	static
	{
		System.out.println("School Tuition Fee Initialized:"+(tuitionFee=30000));
	}
		
	Student(String nm,String clsnm)
	{
		this.name=nm;
		this.className=clsnm;
	}		
		
	void setName(String nm)
	{
		this.name=nm;
	}		
	void setClassName(String clsnm)
	{
		this.className=clsnm;
	}
	String getName()
	{
		return this.name;
	}
	String getClassName()
	{
		return this.className;
	}
	void showDetails(int a)
	{
		System.out.println("Student"+a+": Name="+name+", Class="+className+", Tuition Fee="+tuitionFee);
	}
}

class Main
{
	public static void main(String args[])
	{
		Student s1=new Student("Anjali","10th");
		Student s2=new Student("Vikram","12th");
		
		s1.showDetails(1);
		s2.showDetails(2);
	}
}