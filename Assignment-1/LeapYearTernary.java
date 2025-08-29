import java.util.Scanner;
class LeapYearTernary
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year=");
		int year=sc.nextInt();
		
		String res=(year%4==0)? "Leap Year" : "Non Leap Year";
		System.out.println(res);
	}
}