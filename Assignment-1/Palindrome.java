import java.util.Scanner;
class Palindrome
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a 4 digit number:");
		int num=sc.nextInt();
		int orig=num;
		int rev=0;
		
		while(num>0)
		{
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		System.out.println("Reversed number:"+rev);
		
		if(orig==rev)
			System.out.println(orig +" is a palindrome.");
		else
			System.out.println(orig +" is not a palindrome.");
	}
}