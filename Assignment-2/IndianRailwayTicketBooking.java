class Passenger
{
	String name;
	int age;
	String seatType;
	static int totalTickBook;
	
	Passenger(String name,int age)
	{
		this.name=name;
		this.age=age;
		this.seatType="General";
		totalTickBook++;
	}
	Passenger(String name,int age,String seatType)
	{
		this.name=name;
		this.age=age;
        this.seatType=seatType;
		totalTickBook++;
	}
	
	void showDetails(int passengerNo)
	{
		System.out.println("Passenger"+passengerNo+":Name:"+name+", Age:"+age+", Seat:"+seatType);
	}
	
	static void showTotalPassenger()
	{
		System.out.println("Total Passengers Booked:"+totalTickBook);
	}
}

class Main
{
	public static void main(String args[])
	{
		Passenger p1=new Passenger("Ravi",25);
		Passenger p2=new Passenger("Anita",30,"AC Sleeper");
		Passenger p3=new Passenger("Suresh",40);
		
		p1.showDetails(1);
		p2.showDetails(2);
		p3.showDetails(3);
		
		Passenger.showTotalPassenger();
	}
}