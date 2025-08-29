import java.util.Scanner;
class CheckCharacterType
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a character=");
		char ch=sc.next().charAt(0);
		
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
			System.out.println("It is an Alphabet");
		else if(ch>='0' && ch<= '9')
			System.out.println("It is an Digit");
		else 
			System.out.println("It is Special Character");
	
	}
}