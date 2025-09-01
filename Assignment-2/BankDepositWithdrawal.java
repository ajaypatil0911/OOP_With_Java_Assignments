class BankAccount
{
	String accHolder;
	double balance;
	
	
	BankAccount(String acc,double bal)
	{
		this.accHolder=acc;
		this.balance=bal;
	}
	
	void setAccHolder(String acc)
	{
		this.accHolder=acc;
	}
	void setBalance(double bal)
	{
		this.balance=bal;
	}
	
	String getaccHolder()
	{
		return this.accHolder;
	}
	double getbalance()
	{
		return  this.balance;
	}
	void deposit(double amount)
	{
		balance=balance+amount;
	}
	void withdrawal(double amount)
	{
		balance=balance-amount;
	}
	
	void showAccInfo()
	{
		System.out.println("Account Holder="+accHolder+" Balance="+balance);
	}
	
}

class Main
{
	public static void main(String args[])
	{
		BankAccount b1=new BankAccount("Ajay",15000);
		BankAccount b2=new BankAccount("Patil",20000);
		
		b1.deposit(15000);
		System.out.println(b1.getbalance());
		b1.showAccInfo();
	}
}