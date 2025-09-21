import java.util.*;
class Demo
{
	public static void main(String args[])
	{
		Map<String,Integer> att=new TreeMap<>();
		att.put("Amit",90);
		att.put("Rohan",85);
		att.put("Priya",95);
		
		System.out.println("Attendance Report:"+att);
	}
}