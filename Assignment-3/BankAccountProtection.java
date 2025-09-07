class BankAccount
{
	private double balance;
	
	void deposit(double dep)
	{
		if(dep>0)
		{
		balance=balance+dep;
		System.out.println("Deposit="+dep);
	    }
		else
			System.out.println("Invalid Deposit Amount");
	}
	void withdraw(double wit)
	{
		if(wit>0&&wit<=balance)
		{
		System.out.println("Withdraw="+wit);
		balance=balance-wit;
		}
		else
			System.out.println("Insufficient balance or invalid amount");
	}
	double getBalance()
	{
		return this.balance;
	}
}
class Demo
{
	public static void main(String args[])
	{
	BankAccount b1=new BankAccount();
	b1.deposit(5000);
	b1.withdraw(2000);
	System.out.println("Updated Balance="+b1.getBalance());
	}
}