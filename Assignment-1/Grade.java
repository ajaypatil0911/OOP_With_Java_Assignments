import java.util.Scanner;
class Grade
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks=");
		int mar=sc.nextInt();
		
		if(mar>=90 && mar<=100)
			System.out.println("Grade=A+");
		if(mar>=85 && mar<=89)
			System.out.println("Grade=A");
		if(mar>=80 && mar<=84)
			System.out.println("Grade=A-");
		if(mar>=75 && mar<=79)
			System.out.println("Grade=B+");
		if(mar>=70 && mar<=74)
			System.out.println("Grade=B");
		if(mar>=65 && mar<=69)
			System.out.println("Grade=B-");
		if(mar>=60 && mar<=64)
			System.out.println("Grade=C+");
		if(mar>=50 && mar<=59)
			System.out.println("Grade=C");
		if(mar>=40 && mar<=49)
			System.out.println("Grade=D");
		if(mar<40)
			System.out.println("Grade=F");
	}
}