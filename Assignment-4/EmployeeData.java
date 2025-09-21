import java.util.Scanner;
class Employee
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
		int[] salary=new int[n];
		
		for(int i=0;i<n;i++)
		{
			salary[i]=sc.nextInt();
		}
		
		int index=sc.nextInt();
		int hours=sc.nextInt();
		
		try{
		int sal=salary[index];
		try{
			int wage=sal/hours;
			System.out.println("Hourly Wage="+wage);
		}catch(ArithmeticException e){
		 System.out.println("Division by zero");
		}
	}catch(ArrayIndexOutOfBoundsException e){
	  System.out.println("Invalid index");
	}
	}
}