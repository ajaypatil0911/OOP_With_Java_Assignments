import java.util.Scanner;
class Score
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array=");
		int s=sc.nextInt();
		int[] arr=new int[s];
		
		System.out.println("Enter array elements:");
		for(int i=0;i<s;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter array index you want to access=");
		int ind=sc.nextInt();
		
		try{
		System.out.println(arr[ind]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid index access");
		}
	}
}