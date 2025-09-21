import java.util.*;
class Demo
{
	public static void main(String args[])
	{
		Stack<String> page=new Stack<>();
		page.push("Google");
		page.push("Youtube");
		page.push("GFG");
		
		page.pop();
		System.out.println("Current history:"+page);
	}
}