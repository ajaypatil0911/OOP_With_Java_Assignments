import java.util.Scanner;
class PassFail
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks=");
		int marks=sc.nextInt();
		
		String res=(marks>=35)? "Pass" : "Fail";
		System.out.println(res);
	}
}