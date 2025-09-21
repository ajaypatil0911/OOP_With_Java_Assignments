import java.util.*;
class Demo
{
	public static void main(String args[])
	{
		Set<Integer> vote=new TreeSet<>();
		vote.add(201);
		vote.add(202);
		vote.add(203);
		vote.add(202);
		
		System.out.println("Total voters:"+vote.size());
	}
}