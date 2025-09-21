import java.util.*;
class Demo
{
	public static void main(String args[])
	{
		ArrayList<String> task=new ArrayList();
		task.add("Study Java");
		task.add("Complete Assignments");
		task.add("Exercise");
		
		task.remove("Exercise");
		
		System.out.println("Remaining tasks:"+task);
	}
}