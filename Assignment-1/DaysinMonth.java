import java.util.Scanner;
class DaysinMonth
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter month number=");
		int num=sc.nextInt();
		
		if(num==1||num==3||num==5||num==7||num==8||num==10||num==12)
			System.out.println("31 Days");
		else if(num==2)
			System.out.println("28 or 29 Days");
		else 
			System.out.println("30 Days");
	}
}