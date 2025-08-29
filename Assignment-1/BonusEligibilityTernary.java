import java.util.Scanner;
class  BonusEligibilityTernary
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Salary=");
		int sal=sc.nextInt();
		System.out.println("Enter year of service=");
		int ser=sc.nextInt();
		
		int res=(ser>5) ? sal*5/100 : 0 ;
		
		System.out.println("Bonous="+res);
		
	}
}	