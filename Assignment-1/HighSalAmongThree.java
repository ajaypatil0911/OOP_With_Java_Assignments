import java.util.Scanner;
class HighSalAmongThree
{
	public static void main(String args[])
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter salary for company 1=");
	  int sal1=sc.nextInt();
	  System.out.println("Enter salary for company 2=");
	  int sal2=sc.nextInt();
	  System.out.println("Enter salary for company 3=");
	  int sal3=sc.nextInt();
	  
	  if(sal1>sal2 && sal1>sal3)
	     System.out.println("company 1 offer the higher salary");
      else if(sal2>sal3 && sal2>sal1)
		 System.out.println("company 2 offer the higher salary");
	 else if(sal3>sal1 && sal3>sal2)
		 System.out.println("company 3 offer the higher salary");
	  
	}
}