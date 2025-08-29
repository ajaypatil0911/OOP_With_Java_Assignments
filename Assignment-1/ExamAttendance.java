import java.util.Scanner;
class ExamAttendance
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Total classes held=100");
		System.out.println("Enter class attended=");
		int att=sc.nextInt();
		if(att>=75)
			System.out.println("Student is allowed to sit for the exam");
		else
			System.out.println("Student is not allowed to sit for the exam");
	}
}
 