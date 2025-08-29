import java.util.Scanner;
class MessageBasedonNumber
{
	public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number between(1-5):");
		int num=sc.nextInt();
		
		switch(num)
		{
			case 1:
			System.out.println("You selected option 1");
			break;
			
			case 2:
			System.out.println("You selected option 2");
			break;
			
			case 3:
			System.out.println("You selected option 3");
			break;
			
			case 4:
			System.out.println("You selected option 4");
			break;
			
			case 5:
			System.out.println("You selected option 5");
			break;
			
	}
}
}
