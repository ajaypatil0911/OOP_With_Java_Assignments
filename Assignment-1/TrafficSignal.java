import java.util.Scanner;
class TrafficSignal
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter traffic light color (Red, Green, Yellow):");
		String color=sc.nextLine();
		
		switch(color)
		{
			case "Red":
			System.out.println("Stop");
			break;
			
			case "Green":
			System.out.println("Go");
			break;
			
			case "Yellow":
			System.out.println("Slow Down");
			break;
	}
}
}