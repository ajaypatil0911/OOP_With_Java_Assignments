class TeaCup
{
	String teaType;
	static int totalCups;
	
	TeaCup(String type)
	{
		this.teaType=type;
		totalCups++;
	}
	
	String getTeaType()
	{
		return this.teaType;
	}
	
	static void showTotalCups()
	{
		System.out.println("Total cups made:"+totalCups);
	}
	
	public static void main(String args[])
	{
		TeaCup t1=new TeaCup("Masala Tea");
		TeaCup t2=new TeaCup("Green Tea");
		TeaCup t3=new TeaCup("Ginger Tea");
		
		System.out.println("Cup1 type:"+t1.getTeaType());
		System.out.println("Cup2 type:"+t2.getTeaType());
		System.out.println("Cup3 type:"+t3.getTeaType());
		showTotalCups();
	}
	
}
