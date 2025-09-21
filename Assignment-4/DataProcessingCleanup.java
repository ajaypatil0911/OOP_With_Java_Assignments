class Demo
{
	public static void main(String args[])
	{
		try{
			int num=Integer.parseInt("abc");
		}
		catch(Exception e)
		{
			System.out.println("Exception occurred: Invalid input");
		}
		finally{
			System.out.println("Data processing completed");
		}
	}
}