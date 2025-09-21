import java.util.*;
class Demo
{
	public static void main(String args[])
	{
		Set<String> att=new HashSet<>();
		att.add("Amit");
		att.add("Rohan");
		att.add("Amit");
		att.add("Priya");
		System.out.println("Total Unique attendees:"+att.size());
	}
}
