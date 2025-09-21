import java.util.*;
class Demo
{
	public static void main(String args[])
	{
	   ArrayList<String> store=new ArrayList();
 	   String[] input={"Java","Python","C++","DSA","OOP","Spring"};
	   
	   
	  for(String app:input)
	  {
		 if(store.size()==5)
		 {
			 store.remove(0);
		 }
		 store.add(app);
	   }
	   System.out.println("Recent Searches:"+store);
	   
	   
	}
}
