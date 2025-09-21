class InvalidMarksException extends Exception{
public InvalidMarksException(String message)
{
	super(message);
}
}
public class MarksValidation{
 static void validateMarks(int marks) throws InvalidMarksException{
  if(marks<0||marks>100)
  {
	throw new InvalidMarksException("Invalid marks");  
  }
  else
	  System.out.println("Valid marks:"+marks);
 
}
public static void main(String args[])
{
	try{
		int marks=-5;
		validateMarks(marks);
	}catch(InvalidMarksException e)
	{
		System.out.println(e.getMessage());
	}
}
}
