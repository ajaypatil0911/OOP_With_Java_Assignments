import java.util.Scanner;
class Armstrongseries
{
	public static void main(String args[])
	{
		System.out.println("Armstrong number between 100-500 are:");
		
		for(int num=100;num<=500;num++)
		{
			int orig=num;
			int sum=0;
			
			int temp=num;
			while(temp>0)
			{
				int digit=temp%10;
				sum=sum+digit*digit*digit;
				temp=temp/10;
			}
			
			if(sum==orig)
				System.out.println(orig);
		}
	}
}