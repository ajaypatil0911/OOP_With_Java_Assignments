import java.util.*;
class Demo
{
	public static void main(String args[])
	{
		Set<String> reg=new TreeSet<>();
		reg.add("CS101");
		reg.add("MA101");
		reg.add("CS101");
		
		System.out.println("Registered Courses:"+reg);
	}
}