import java.util.*;
class Demo
{
	public static void main(String args[])
	{
	Stack<String> undo=new Stack<>();
	undo.push("TypeA");
	undo.push("TypeB");
	undo.push("Delete");
	
	undo.pop();
	System.out.println("Current actions:"+undo);
	}
}