import java.util.Scanner;
class PositiveNegativeorZero
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number=");
		int num=sc.nextInt();
		
		String res=(num>0)? "Number Is Positive" : (num<0)? "Number Is Negative": (num==0)? "Number Is Zero": "Invalid";
		
		System.out.println(res);
	}
}