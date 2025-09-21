import java.util.*;
class Demo
{
   public static void main(String args[])
   {
	   Queue<String> job=new PriorityQueue<>();
	   
	   job.add("Doc1");
	   job.add("Doc2");
	   job.add("Doc3");
	   
	   System.out.println("Printing "+job.poll());
	   System.out.println("Queue:"+job);
   }
}