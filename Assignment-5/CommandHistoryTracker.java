import java.util.*;
class Demo
{
	public static void main(String args[])
	{
		int limit=3;
		
		Queue<String> tracker=new LinkedList<>();
		
		String[] comm={"Is","pwd","cd..","mkdir"};
		
		for(String perm:comm)
		{
			if(tracker.size()==limit)
			{
				tracker.poll();
			}
			tracker.add(perm);
		}
          
        System.out.println("Recent Commands"+tracker);		  
	}
}