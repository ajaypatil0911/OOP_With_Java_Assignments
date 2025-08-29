import java.util.Scanner;
class VowelConsonantTernary
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Character=");
		char ch=sc.next().charAt(0);
		
		String res=(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') ? "Vowel" : "Consonents" ;
		
		System.out.println(res);
	}
}