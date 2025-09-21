import java.util.*;
class Demo
{
	public static void main(String args[])
	{
		Map<String,Integer> book=new TreeMap<>();
		
		book.put("Java",3);
		book.put("Python",5);
		
		String firstkey=book.keySet().iterator().next();
		
		book.put(firstkey,book.get(firstkey)-1);
		
		System.out.println("Current inventory:"+book);
		
		
	}
}