import java.util.Scanner;
class Armstrong
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a three digit number=");
		int num=sc.nextInt();
		int orig=num;
		int sum=0;
		
		while(num>0)
		{
			int digit=num%10;
			sum=sum+digit*digit*digit;
			num=num/10;
		}
		
		if(sum==orig)
			System.out.println(orig+" is an armstrong number");
        else
            System.out.println(orig+" is not a armstrong number");			
		
	}
}
		