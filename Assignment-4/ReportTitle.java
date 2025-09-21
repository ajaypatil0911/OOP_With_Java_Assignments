class Demo
{
	public static void main(String args[])
	{
		String title="Annual Report";
		String dept="CDAC";
		
		StringBuilder sb=new StringBuilder();
		
		sb.append("Annual ").append(dept).append(" Report");
		
		System.out.println(sb.toString());
	}
}