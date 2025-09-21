class Demo
{
	public static void main(String args[])
	{
		String amountStr="1000";
		int amount=Integer.parseInt(amountStr);
		
		int additional=500;
		int total=amount+additional;
		
		System.out.println(amount+" + "+additional+" = "+total);
	}
}