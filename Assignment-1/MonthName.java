import java.util.Scanner;
class MonthName
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter month number=");
		int month=sc.nextInt();
		
		if(month==1)
			System.out.println("Month is january");
		if(month==2)
			System.out.println("Month is february");
		if(month==3)
			System.out.println("Month is march");
		if(month==4)
			System.out.println("Month is april");
		if(month==5)
			System.out.println("Month is may");
		if(month==6)
			System.out.println("Month is june");
		if(month==7)
			System.out.println("Month is july");
		if(month==8)
			System.out.println("Month is august");
		if(month==9)
			System.out.println("Month is september");
		if(month==10)
			System.out.println("Month is october");
		if(month==11)
			System.out.println("Month is november");
		if(month==12)
			System.out.println("Month is december");
	}
}