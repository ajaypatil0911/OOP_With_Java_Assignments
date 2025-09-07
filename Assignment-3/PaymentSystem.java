abstract class Payment
{
	abstract void pay();
	
}
class CreditCardPayment extends Payment
{
	long  cardNumber;
	double amount;
	
	CreditCardPayment(long  cardNumber,double amount)
	{
		this.cardNumber=cardNumber;
		this.amount=amount;
	}
	void pay()
	{
		System.out.println("Payment via Credit Card "+cardNumber+"->Rs."+amount+" Paid");
	}
}
class UPIPayment extends Payment
{
	String upiId;
	double amount;
	
	UPIPayment(String upiId,double amount)
	{
		this.upiId=upiId;
		this.amount=amount;
	}
	void pay()
	{
		System.out.println("Payment via UPI "+upiId+"->Rs."+amount+" Paid");
	}
}

class Demo
{
	public static void main(String args[])
	{
		Payment p1=new CreditCardPayment(1234567890123456L,5000);
		Payment p2=new UPIPayment("rahul@upi",2000);
		p1.pay();
		p2.pay();
	}
}