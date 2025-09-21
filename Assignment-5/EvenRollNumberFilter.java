import java.util.*;
class Demo
{
	public static void main(String args[])
	{
		List<Integer> roll=new ArrayList<>();
		roll.add(101);
		roll.add(102);
		roll.add(103);
		roll.add(104);
		
		Iterator<Integer> it=roll.iterator();
		
		while(it.hasNext())
		{
			Integer num=it.next();
			if(num%2 != 0)
				it.remove();
		}
		System.out.println("Even Roll Numbers:"+roll);
	}
}