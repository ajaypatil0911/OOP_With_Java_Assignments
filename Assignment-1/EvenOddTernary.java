import java.util.Scanner;
class  EvenOddTernary
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number=");
		int num=sc.nextInt();
		
		String res=(num%2==0) ? "Number Is Even" : "Number is Odd";
	    
		System.out.println(res);
	}
}