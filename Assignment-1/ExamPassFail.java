import java.util.Scanner;
class ExamPassFail 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks between 0-100=");
		int mar=sc.nextInt();
		if(mar>=35)
			System.out.println("Passed");
		else 
			System.out.println("Failed");
	}
}