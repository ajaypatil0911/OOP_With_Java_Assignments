import java.util.Scanner;
class VotingEligibility
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Age=");
		int age=sc.nextInt();
		
		String res=(age>=18) ? "Eligible to vote " : "Not Eligible to vote ";
	    
		System.out.println(res);
	}
}
