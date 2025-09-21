import java.util.*;
class Demo
{
	public static void main(String args[])
	{
		Set<Integer> roll=new HashSet<>();
		roll.add(101);
		roll.add(102);
		roll.add(101);
		roll.add(103);
		
		System.out.println("Unique Roll Number:"+roll);
	}
}