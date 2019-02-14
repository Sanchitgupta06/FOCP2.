import java.io.*;
public class FileDemo
{
	public static void main(String[] args)
	 {
      try
	   {
	     File f=new File("FileDemo.java");
	     System.out.println(f.length());
	     System.out.println(f.getAbsolutePath());
	   }
	  catch(Exception e)
	  {
	  System.out.println(e);
	  }
	}
}