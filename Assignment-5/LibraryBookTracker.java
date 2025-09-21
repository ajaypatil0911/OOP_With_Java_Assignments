class Book
{
   String title;
   String author;
   boolean issued;
   static int totalIssuedBooks;
   
   Book(String tit,String auth,boolean iss)
   {
	   this.title=tit;
	   this.author=auth;
	   this.issued=iss;
	   
	   if(iss)
	   {
		   totalIssuedBooks++;
	   }
   }
   void setTitle(String tit)
   {
	   this.title=tit;
   }
   void setAuthor(String aut)
   {
	   this.author=aut;
   }
   void setIssue(boolean b)
   {
	   this.issued=b;
   }
   String getTitle()
   {
	   return this.title;
   }
   String getAuthor()
   {
	   return this.author;
   }
   boolean getIssued()
   {
	   return this.issued;
   }
   
   static void showTotalIssued()
   {
	   System.out.println("Total Book Issued="+totalIssuedBooks);
   }
   
   public static void main(String args[])
   {
	   Book b1=new Book("Harry Potter","J.K.Rowling",true);
	   Book b2=new Book("Five Point Someone","Chetan Bhagat",false);
	   Book b3=new Book("Rich Dad Poor Dad","Robert Kiyosaki",true);
	   
	   System.out.println("Book1 issued?"+b1.issued);
   }
}
   