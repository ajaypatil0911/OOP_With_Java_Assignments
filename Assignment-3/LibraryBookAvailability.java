class Book
{
	private int copiesAvailable;
	
	void setCopies(int copy)
	{
		this.copiesAvailable=copy;
	}
	int getCopies()
	{
		return this.copiesAvailable;
	}
	void addCopies(int add)
	{
		copiesAvailable=copiesAvailable+add;
		System.out.println(add+" copies added");
	}
	void removeCopies(int rem)
	{
		copiesAvailable=copiesAvailable-rem;
		System.out.println(rem+" copies removed");
	}
}
class Demo
{
	public static void main(String args[])
	{
	Book b1=new Book();
	b1.addCopies(3);
	b1.removeCopies(1);
	
	System.out.println("Copies available="+b1.getCopies());
	}
}