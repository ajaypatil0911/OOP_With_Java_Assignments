class BankAccount
{
	String name;
	double balance;
	static double interestRate;
	
	static
	{
		System.out.println("Bank Interest Rate Initialized:"+(interestRate=4)+"%");
	}
	BankAccount(String nm,double bal)
	{
		this.name=nm;
		this.balance=bal;
	}
	
	void setName(String nm)
	{
		this.name=nm;
	}
	void setBalance(double bal)
	{
		this.balance=bal;
	}
	String getName()
	{
		return this.name;
	}
	double getBalance()
	{
		return this.balance;
	}
	void showDetails(int a)
	{
		System.out.println("Account"+a+": Name="+name+", Balance="+balance+",Interest Rate="+interestRate+"%");
	}
}

class Main
{
	public static void main(String args[])
	{
		BankAccount b1=new BankAccount("Rohit",5000);
		BankAccount b2=new BankAccount("Priya",15000);
		
		b1.showDetails(1);
		b2.showDetails(2);
	}
}