class Customer
{
	String name;
	String ticketType;
	static int totalTicketSold;
	
	Customer(String name)
	{
		this.name=name;
		this.ticketType="Normal";
		totalTicketSold++;
	}
	Customer(String name,String ticketType)
	{
		this.name=name;
		this.ticketType=ticketType;
		totalTicketSold++;
	}
	
	void showDetails(int cust)
	{
		System.out.println("Customer"+cust+":Name:"+name+", Ticket:"+ticketType);
	}
	
	static void showTotalTicket()
	{
		System.out.println("Total Tickets Sold:"+totalTicketSold);
	}
}
class Main
{
	public static void main(String args[])
	{
		Customer c1=new Customer("Rahul");
		Customer c2=new Customer("Pooja","Premium");
		Customer c3=new Customer("Amit");
		
		c1.showDetails(1);
		c2.showDetails(2);
		c3.showDetails(3);
		Customer.showTotalTicket();
	}
}