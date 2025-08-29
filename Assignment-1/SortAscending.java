import java.util.Scanner;
class SortAscending
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter three numbers=");
		int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
		
		int small,mid,lar;
		
		if(a<=b && a<=c)
		{
			small=a;
			if(b<=c)
			{
				mid=b;
				lar=c;
			}
			else
			{
				mid=c;
				lar=b;
			}
		}
		else if(b<=a && b<=c)
		{
			small=b;
			if(a<=c)
			{
				mid=a;
				lar=c;
			}
			else
			{
				mid=c;
				lar=a;
			}
		}
		else
		{
			small=c;
			if(a<=b)
			{
				mid=a;
				lar=b;
			}
			else
			{
				mid=b;
				lar=a;
			}
		}
		System.out.println("Numbers in ascending order:"+small+" , "+mid+" , "+lar);
			
	}
}