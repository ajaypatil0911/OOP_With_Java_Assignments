class Account
{
	int accountNo;
	double balance;
	
	Account(int accountNo,double balance)
	{
		this.accountNo=accountNo;
		this.balance=balance;
	}
	void display()
	{
	}
}
class SavingAccount extends Account
{
	int interestRate;
	
	SavingAccount(int accountNo,double balance,int interestRate)
	{
		super(accountNo,balance);
		this.interestRate=interestRate;
	}
	void display()
	{
		System.out.println("Saving->"+accountNo+", Balance="+balance+", Interest="+interestRate+"%");
	}
}
class CurrentAccount extends Account
{
	int overdraftLimit;
	
	CurrentAccount(int accountNo,double balance,int overdraftLimit)
	{
			super(accountNo,balance);
			this.overdraftLimit=overdraftLimit;
	}
		
		void display()
	{
		System.out.println("Current->"+accountNo+", Balance="+balance+", Overdraft="+overdraftLimit);
	}
}


class Demo
{
	public static void main(String args[])
	{
	Account s1=new SavingAccount(101,5000,5);
	Account c1=new CurrentAccount(102,10000,2000);
	s1.display();
	c1.display();
	
	}
}