import java.util.*;
class Demo
{
	public static void main(String args[])
	{
		PriorityQueue<String> pq=new PriorityQueue();
		pq.add("Amit");
		pq.add("Priya");
		pq.add("Rohan");
		
		System.out.println(pq);
		
		pq.remove();
		System.out.println("Queue:"+pq);
		
	}
}