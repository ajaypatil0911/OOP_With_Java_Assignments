import java.util.*;
class Demo
{
	public static void main(String args[])
	{
		Map<String,Integer> grade=new TreeMap<>();
		grade.put("Amit",85);
		grade.put("Priya",92);
		
		Iterator<Map.Entry<String,Integer>> itr=grade.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Map.Entry<String,Integer> entry=itr.next();
			System.out.println(entry);
		}
		
	}
}