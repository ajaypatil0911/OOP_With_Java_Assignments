class Demo
{
	public static void processPayment()
	{
		try{
			throw new Exception("Payment Failed");
		}
		catch(Exception e)
		{
			System.out.println("Exception occured:"+e.getMessage());
		}
		finally{
			System.out.println("Cleanup done");
	}
	}
	public static void main(String args[])
	{
		processPayment();
	}
}