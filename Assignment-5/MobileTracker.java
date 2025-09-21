class Mobile
{
	
	String model;
	static int totalMobiles;
	
	Mobile(String m)
	{
		this.model=m;
		totalMobiles++;
	}
	String getmodel()
	{
		return this.model;
	}
	static void showTotalMobiles()
	{
		System.out.println("Total mobiles in stock:"+totalMobiles);
	}
	public static void main(String args[])
	{
		Mobile m1=new Mobile("Samsung Galaxy M32");
		Mobile m2=new Mobile("Redmi Note 12");
		
		System.out.println("Mobile1 model:"+m1.getmodel());
		System.out.println("Mobile2 model:"+m1.getmodel());
		Mobile.showTotalMobiles();
	}
}