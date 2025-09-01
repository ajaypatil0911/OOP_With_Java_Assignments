class BankAccount
{
	String accHolder;
	double balance;
	
	static String bankName="CDAC Bank";
	
	static void displayBankName()
	{
		System.out.println("Bank Name:"+bankName);
	}
	
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
		BankAccount.displayBankName();
		BankAccount b1=new BankAccount("Ajay",15000);
		
		b1.showAccInfo();
	}
}