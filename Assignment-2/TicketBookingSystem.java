class Ticket
{
	String passengerName;
	int ticketNo;
	static int counter=5001;
	
	Ticket(String passengerName)
	{
		this.passengerName=passengerName;
		this.ticketNo=counter++;
	}
	
	void displayTicket()
	{
		System.out.println("Passenger Name="+passengerName+" Ticket No.="+ticketNo);
	}
}
class Main
{
	public static void main(String args[])
	{
		Ticket t1=new Ticket("Ajay");
		Ticket t2=new Ticket("Rahul");
		t1.displayTicket();
		t2.displayTicket();
	}
}