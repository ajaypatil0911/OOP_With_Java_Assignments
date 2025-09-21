import java.util.*;
class Demo
{
	public static void main(String args[])
	{
		ArrayList<String> names=new ArrayList();
		names.add("Amit");
		names.add("Priya");
		names.add("Rohan");
		System.out.println(names);
		names.remove(1);
			System.out.println("Students:"+names);
	}
}