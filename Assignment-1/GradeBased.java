import java.util.Scanner;
class GradeBased
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter percentage marks:");
		int marks=sc.nextInt();
		
		if(marks>=90)
			System.out.println("A+");
		else if(marks>=76 && marks<=89)
			System.out.println("A");
		else if(marks>=66 && marks<=75)
			System.out.println("B+");
		else if(marks>=51 && marks<=65)
			System.out.println("B");
		else if(marks>=35 && marks<=50)
			System.out.println("C");
		else if(marks<35)
		    System.out.println("Fail");
		
	}
}
