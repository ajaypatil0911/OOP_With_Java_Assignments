import java.util.Scanner;
class  GradeUsingSwitch
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks (0-100):");
		int marks=sc.nextInt();
		
		String grade;
		
		switch(marks/10)
		{
			case 10:
			
			case 9:
			
			case 8:
			grade="A";
			break;
			
			case 7:
			grade="B";
			break;
			
			case 6:
			
			case 5:
			if(marks>=55)
				grade="C";
			else
				grade="D";
			break;
			
			case 4:
			if(marks>=45)
				grade="D";
			else
				grade="E";
			
			case 3:
			case 2:
			grade="E";
			break;
			
			case 1:
			
			case 0:
			grade="F";
			break;
			
			default:
			grade="Invalid Marks";
				
	}
	System.out.println("Grade="+grade);
}
}
