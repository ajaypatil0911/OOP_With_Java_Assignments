import java.util.Scanner;
class BasicCalculatorUsingSwitch
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number=");
		int num1=sc.nextInt();
		System.out.println("Enter second number=");
		int num2=sc.nextInt();
		
		System.out.println("Enter operator=");
		char op=sc.next().charAt(0);
		
		int res=0;
		switch(op)
		{
			case '+':
			res=num1+num2;
			System.out.println("Result="+res);
			break;
			
			case '-':
			res=num1-num2;
			System.out.println("Result="+res);
			break;
			
			case '/':
			res=num1/num2;
			System.out.println("Result="+res);
			break;
			
			case '*':
			res=num1*num2;
			System.out.println("Result="+res);
			break;
			
	}
}
}