import java.util.*;
class Demo
{
	public static void main(String args[])
	{
		Map<String,Integer> grade=new TreeMap<>();
		
		grade.put("Rohan",78);
		grade.put("Rohan",88);
		
		System.out.println("Updated Grade:"+grade);
	}
}