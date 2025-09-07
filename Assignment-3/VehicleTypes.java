class Vehicle
{
	String brand;
	int speed;
	
	Vehicle(String brand,int speed)
	{
		this.brand=brand;
		this.speed=speed;
	}
	
}
class Car extends Vehicle
{
	String modelType;
	
	Car(String brand,int speed,String modelType)
	{
		super(brand,speed);
		this.speed=speed;
		this.modelType=modelType;
	}
	
	void display()
	{
		System.out.println("Car->"+brand+" "+modelType+", Speed="+speed);
	}
}
class Bike extends Vehicle
{
	String modelType;
	
	Bike(String brand,int speed,String modelType)
	{
		super(brand,speed);
		this.speed=speed;
		this.modelType=modelType;	
	}
	void display()
	{
		System.out.println("Bike->"+brand+" "+modelType+", Speed="+speed);
	}
}

class Demo
{
	public static void main(String args[])
	{
	Car c1=new Car("Honda",180,"Civic");
	Bike b1=new Bike("Yamaha",120,"R15");
	c1.display();
	b1.display();
	}
}