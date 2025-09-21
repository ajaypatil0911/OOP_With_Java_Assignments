import java.util.*;
import java.io.*;
class Demo
{
	public static void main(String args[]) 
	{
		try{
		File f1=new File("student_list.txt");
		FileReader fr=new FileReader(f1);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found");
		}
	}
}