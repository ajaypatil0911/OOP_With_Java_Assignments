import java.util.Scanner;
class EvenOddStatusofTwoNumbers 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first numbers=");
		int num1=sc.nextInt();
		System.out.println("Enter second number=");
		int num2=sc.nextInt();
		
		if(num1%2==0 && num2%2==0)
			System.out.println("Both are even");
		if(num1%2==1 && num1%2==1)
			System.out.println("Both are odd");
		else
			System.out.println("Numbers are mixed(one even,one odd).");
		
	}
}