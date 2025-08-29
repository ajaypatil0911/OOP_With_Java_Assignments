import java.util.Scanner;
class EmployeeBonus
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter salary");
		int sal=sc.nextInt();
		System.out.println("Enter year of service=");
		int ser=sc.nextInt();
		
		if(ser>5)
		{
			int amt;
			amt=sal*5/100;
			System.out.println("Bonus amount:"+amt);
		}
		else
			System.out.println("Bonous amount=0");
		
	}
}