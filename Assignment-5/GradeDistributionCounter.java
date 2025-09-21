import java.util.*;
class Demo
{
	public static void main(String args[])
	{
		Map<String,Integer> student=new LinkedHashMap<>();
		student.put("Amit",85);
		student.put("Priya",92);
		
		Iterator<Map.Entry<String,Integer>it=student.entrySet().iterator();
		while(it.hasNext())
		{
			Map.Entry<String,Integer> entry=it.next();
		}
	}
}