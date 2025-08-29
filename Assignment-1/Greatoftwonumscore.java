import java.util.Scanner;
class Greatoftwonumscore
{
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter first number=");
	   int num1=sc.nextInt();
	   int num2=sc.nextInt();
	   
	   if(num1>num2)
	       System.out.println("Test 1 has higher score.");
       else
		   System.out.println("Test 2 has higher score.");
   }
}