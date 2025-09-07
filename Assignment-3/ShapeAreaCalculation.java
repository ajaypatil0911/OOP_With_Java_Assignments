class Shape
{
	void area()
	{
		
	}
}
class Rectangle extends Shape
{
	int length,breadth;
	
	Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	
	void area()
	{
		System.out.println("Rectangle Area="+length*breadth);
	}
	
}
class  Circle extends Shape
{
	int radius;
	
	Circle(int radius)
	{
		this.radius=radius;
	}
	void area()
	{
		System.out.println("Circle Area="+3.14*radius*radius);
	}
}

class Demo
{
	public static void main(String args[])
	{
		Rectangle r1=new Rectangle(5,10);
		r1.area();
		Circle c1=new Circle(7);
		c1.area();
	}
}