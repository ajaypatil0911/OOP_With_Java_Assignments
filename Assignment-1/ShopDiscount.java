import java.util.Scanner;
class  ShopDiscount 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total purchased amount=");
		int amt=sc.nextInt();
		if(amt>1000)
		{
			int dis=0;
			dis=amt*10/100;
			amt=amt-dis;
			System.out.println("Final cost after discount:"+amt);
		}
		else
			System.out.println("Final cost after discount:"+amt); 
	}
}	
		