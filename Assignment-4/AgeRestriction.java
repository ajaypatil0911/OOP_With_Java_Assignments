import java.util.*;
class AgeNotValidException extends Exception
{
	AgeNotValidException()
	{
		super("age must be >=18");
	}
}
class Demo
{
	public static void main(String args[]) throws AgeNotValidException
	{
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		
		if(age<18)
			throw new AgeNotValidException();
		else
			System.out.println("You are eligible");
	}
}