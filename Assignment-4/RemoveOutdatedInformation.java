class Demo
{
	public static void main(String args[])
	{
		StringBuffer sb=new StringBuffer("CDAC Kharghar 2024");
		
		int start=sb.indexOf("2024");
		int end=start+"2024".length();
		
		sb.delete(start,end);
		
		System.out.println(sb.toString().trim());
		
	}
}