import java.util.*;
class Demo
{
	public static void main(String args[])
	{
		List<String> morning=new ArrayList<>();
		List<String> evening=new ArrayList<>();
		morning.add("Amit");
		morning.add("Priya");
		
		evening.add("Rohan");
		evening.add("Priya");
		
		Set<String> fin=new TreeSet<>();
		fin.addAll(morning);
		fin.addAll(evening);
		System.out.println(fin);
	}
}