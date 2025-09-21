import java.util.*;
class Demo
{
	public static void main(String args[])
	{
		Queue<String> ticket=new PriorityQueue<>();
		
		ticket.add("Amit");
		ticket.add("Priya");
		ticket.add("Rohan");
		
		System.out.println("Serving:"+ticket.poll()+"");
		
		System.out.println("Queue:"+ticket);
		
	}
}