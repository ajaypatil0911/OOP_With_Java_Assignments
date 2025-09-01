class Book
{
	int bookId;
	String title;
	String author;
	
	Book(int bookId,String title,String author)
	{
		this.bookId=bookId;
		this.title=title;
		this.author=author;
	}
	
	void setBookId(int bookId)
	{
		this.bookId=bookId;
	}
	void setTitle(String title)
	{
		this.title=title;
	}
	void setAuthor(String author)
	{
		this.author=author;
	}
	
	int getBookId()
	{
		return this.bookId;
	}
	String getTitle()
	{
		return this.title;
	}
	String getAuthor()
	{
		return this.author;
	}
}

class Library
{
	String libraryName;
	static int totalBooks;
	
	Library(String libraryName)
	{
		this.libraryName=libraryName;
	}
	void addBook(Book b)
	{
		totalBooks++;
		System.out.println("Book Added: "+b.getTitle()+ " by "+b.getAuthor());
	}
	void displayTotalBooks()
	{
		System.out.println("Total books in "+libraryName+": "+totalBooks);
	}
	
	
	public static void main(String args[])
	{
		Library lib=new Library("City Central Library");
		Book b1=new Book(101,"Java Programming","James Gosling");
		Book b2=new Book(102,"Wings Of Fire","Abdul kalam");
		lib.addBook(b1);
		lib.addBook(b2);
		
		lib.displayTotalBooks();
		
	}
}
	