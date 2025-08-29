import java.util.Scanner;
class SmallestofThree
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers=");
		int num1=sc.nextInt(), num2=sc.nextInt(), num3=sc.nextInt();
		
		int small = (num1 < num2) ? ((num1 < num3) ? num1 : num3) : ((num2 < num3) ? num2 : num3);
		
		System.out.println("Smallest Number="+small);

	}
}