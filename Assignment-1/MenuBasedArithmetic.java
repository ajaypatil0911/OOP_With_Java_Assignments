import java.util.Scanner;
class MenuBasedArithmetic
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Select operation (1-Addition, 2-Subtraction):");
		int choice=sc.nextInt();
		
		System.out.println("Enter first number=");
		int num1=sc.nextInt();
		System.out.println("Enter second number=");
		int num2=sc.nextInt();
		
		int res=0;
		switch(choice)
		{
			case 1:
			res=num1+num2;
			System.out.println("Result="+res);
			break;
			case 2:
			res=num1-num2;
			System.out.println("Result="+res);
		}
			
		
	}
}