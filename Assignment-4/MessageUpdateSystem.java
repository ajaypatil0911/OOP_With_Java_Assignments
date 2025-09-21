class Demo
{
	public static void main(String args[])
	{
		StringBuffer sb=new StringBuffer("Old Notice");
		
		int start=sb.indexOf("Old");
		int end=start+"Old".length();
		
		sb.replace(start,end,"Updated");
		
		System.out.println(sb.toString());
	}
}