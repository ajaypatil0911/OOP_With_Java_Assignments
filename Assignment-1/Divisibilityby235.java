import java.util.Scanner;
class  Divisibilityby235 
{
	public static void main(String args[])
	{
       Scanner sc=new Scanner(System.in);
       
	   System.out.println("Enter number=");
 	   int num=sc.nextInt();
	   
	   if(num%2==0)
	   {
		   System.out.println("Divisible by 2");
	   }
	   if(num%3==0)
	   {
		 System.out.println("Divisible by 3");
	   }
	    if(num%5==0)
		{
	   	System.out.println("Divisible by 5");
	     }
		   
	}
}