import java.util.Scanner;
class Discount
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter purchase amount=");
		int amt=sc.nextInt();
		int temp=0;
		int res=(amt>1000) ? temp=amt*10/100 : amt ;
		amt=amt-res;
		System.out.println("Total cost after discount="+amt);
	}
}