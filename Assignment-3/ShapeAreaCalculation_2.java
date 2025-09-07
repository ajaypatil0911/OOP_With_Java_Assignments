class ShapeArea
{
	void calculateArea(int side)
	{
		System.out.println("Square Area="+side*side);
	}
	void calculateArea(int length,int breadth)
	{
		System.out.println("Rectangle Area="+length*breadth);
	}
	void calculateArea(double radius)
	{
		System.out.printf("Circle Area="+ String.format("%.2f",3.14*radius*radius));
	}
	
}
class Demo
{
	public static void main(String args[])
	{
		ShapeArea s1=new ShapeArea();
		int a=5;
		s1.calculateArea(a);
		ShapeArea s2=new ShapeArea();
		s2.calculateArea(4,6);
		ShapeArea s3=new ShapeArea();
		double d=3;
		s2.calculateArea(d);
	}
}