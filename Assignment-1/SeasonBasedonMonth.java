import java.util.Scanner;
class  SeasonBasedonMonth
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter month number=");
		int mon=sc.nextInt();
		
		if(mon==12||mon==1||mon==2)
			System.out.println("Season is Winter");
		else if(mon==3||mon==4||mon==5)
			System.out.println("Season is Summer");
		else if(mon==6||mon==7||mon==8)
			System.out.println("Season is Monsoon");
		else if(mon==9||mon==10||mon==11)
			System.out.println("Season is Autumn");
	}
}