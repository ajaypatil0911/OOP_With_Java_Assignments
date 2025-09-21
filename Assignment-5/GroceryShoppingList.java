import java.util.*;
class Demo
{
	public static void main(String args[])
	{
		ArrayList<String> shop=new ArrayList();
		shop.add("Milk");
		shop.add("Egg");
		shop.add("Bread");
		
		shop.remove("Milk");
		System.out.println("Items to buy:"+shop);
	}
}