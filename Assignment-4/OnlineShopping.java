import java.util.Scanner;
class Shopping
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int quantity=sc.nextInt();
		
		int n=sc.nextInt();
		double[] prices=new double[n];
		
		for(int i=0;i<n;i++)
		{
			prices[i]=sc.nextDouble();
		}
		
		int index=sc.nextInt();
		
		try{
			if(quantity<=0)
			{
				throw new ArithmeticException();
			}
			double total=quantity*prices[index];
			System.out.println("Total price="+total);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmeti Exception caught");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index Exception");
		}
	}
}