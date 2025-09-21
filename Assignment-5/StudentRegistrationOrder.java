import java.util.*;
class Demo
{
	public static void main(String args[])
	{
		Map<String,Integer> order=new LinkedHashMap<>();
		order.put("Amit",101);
		order.put("Rohan",102);
		order.put("Priya",103);
		
		System.out.println("Registration Order:"+order);
	}
}