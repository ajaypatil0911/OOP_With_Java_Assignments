import java.util.Scanner;
class DayTypeSelection
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter day type (1–Workday, 2–Weekend):");
		int type=sc.nextInt();
		
		if(type==1)
			System.out.println("Its Workday");
		else if(type==2)
			System.out.println("It’s weekend. No work today. ");
	}
}
