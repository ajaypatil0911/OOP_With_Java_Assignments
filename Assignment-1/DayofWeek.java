import java.util.Scanner;
class DayofWeek
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter day number=");
		int day=sc.nextInt();
		
		String result=(day==1)? "Sunday": (day==2)?"Monday": (day==3)?"Tuesday": (day==4)?"Wednesday":(day==5)?"Thursday":(day==6)?"Friday":(day==7)?"Saturday":"Invalid Days";
		
		System.out.println("Day is "+result);
	}
}