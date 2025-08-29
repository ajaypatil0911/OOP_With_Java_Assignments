import java.util.Scanner;
class SqrOrRectGard
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of garden=");
		int len=sc.nextInt();
		System.out.println("Enter breadth of garden=");
		int bre=sc.nextInt();
		
		if(len==bre)
			System.out.println("Square Garder");
		else
			System.out.println("Rectangle garden");
	}
}