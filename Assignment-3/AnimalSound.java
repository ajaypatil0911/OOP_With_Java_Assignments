class Animal
{
	void makeSound()
	{
	}
}
class Dog extends Animal
{
	void makeSound()
	{
		System.out.println("Dog ->Bark");
	}
}
class Cat extends Animal
{
	void makeSound()
	{
		System.out.println("Cat ->Meow");
	}
}
class Demo
{
	public static void main(String args[])
	{
		Animal a1=new Dog();
		Animal a2=new Cat();
		a1.makeSound();
		a2.makeSound();
	}
}