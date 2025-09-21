class Demo
{
	public static void main(String args[])
	{
		String orderNo="INV2025";
		
		StringBuilder sb=new StringBuilder(orderNo);
		
		sb.reverse();
		
		System.out.println(sb.toString());
	}
}