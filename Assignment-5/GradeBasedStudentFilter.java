import java.util.*;
class Demo
{
	public static void main(String args[])
	{
		Map<String,Integer> grade=new TreeMap<>();
		
		grade.put("Amit",85);
		grade.put("Priya",55);
		grade.put("Rohan",78);
		
		grade.entrySet().removeIf(entry->entry.getValue()<60);
		
		System.out.println(grade);
			
		
	}
}