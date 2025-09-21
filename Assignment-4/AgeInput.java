import java.util.Scanner;
class Age
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter age=");
		String age=sc.nextLine();
		try{
		   
		   int temp=Integer.parseInt(age);
		   System.out.println(temp);
		
		}catch(NumberFormatException e)
		{
			System.out.println("Invalid number format");
		}
	}
}