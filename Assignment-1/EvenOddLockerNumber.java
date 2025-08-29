import java.util.Scanner;
class  EvenOddLockerNumber 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter locker number=");
		int num=sc.nextInt();
		if(num%2==0)
			System.out.println("Even locker number");
		else
			System.out.println("Odd locker number");
	}
}
