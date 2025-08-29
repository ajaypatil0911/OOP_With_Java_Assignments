import java.util.Scanner;
class Ques12
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age of Friend 1:");
		int one=sc.nextInt();
		System.out.println("Enter age of Friend 2:");
		int two=sc.nextInt();
		System.out.println("Enter age of Friend 3:");
		int three=sc.nextInt();
		
		if(one>two && one>three)
			System.out.println("Oldest Friend 1");
		else if(two>one && two>three)
			System.out.println("Oldest Friend 2");
		else if(three>two && three>one)
			System.out.println("Oldest Friend 3");
		
		
		if(one<two && one<three)
			System.out.println("Youngest Friend 1");
		else if(two<one && two<three)
			System.out.println("Youngest Friend 2");
		else if(three<two && three<one)
			System.out.println("Youngest Friend 3");
		
	}
}