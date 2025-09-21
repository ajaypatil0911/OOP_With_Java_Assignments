import java.util.Scanner;
class Salary
{
	static void divideBonus(int bon,int emp)
	{
		try
		{
		if(emp==0)
		{
			throw new ArithmeticException("Error:division by zero not allowed");
		}
		else
		{
			int temp=bon/emp;
			System.out.println("Equally divided amount is="+temp);
		}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error:"+e.getMessage());
		}
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		divideBonus(a,b);
	}
}