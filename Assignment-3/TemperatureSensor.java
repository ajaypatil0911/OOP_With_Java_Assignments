class TemperatureSensor
{
	private int temperature;
	
	void setTemperature(int t)
	{
		if(t>=0&&t<=100)
			this.temperature=t;
		else
			System.out.println("Temperature out of range");
	}
	int getTemperature()
	{
		return this.temperature;
	}
}
class CheckTemp
{
	public static void main(String args[])
	{
	TemperatureSensor t1=new TemperatureSensor();
	t1.setTemperature(45);
	System.out.println(t1.getTemperature());
	}
}