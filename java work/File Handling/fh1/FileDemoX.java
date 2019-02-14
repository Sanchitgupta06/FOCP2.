import java.io.*;
import java.util.*;
class FileDemoX
{
	public static void main(String[] args)
	{
	  File f=null;
	  try
	  {
	    f=new File("fileX.txt");
	    FileWriter fout=new FileWriter(f);
	    BufferedWriter bout=new BufferedWriter(fout);
	    Scanner sc=new Scanner(System.in);
	    System.out.println("\nEnter SERIAL NO");
	    while(sc.hasNext())
	    {
	     bout.write(Int.toString(d));
	     bout.newLine();
	    }
	    System.out.println("\nEnter NAME");
	    while(sc.hasNext())
	    {
	     bout.write(sc.nextLine());
	     bout.newLine();
	    }
        System.out.println("\nEnter CGPA");
	    while(sc.hasNext())
	    {
	     bout.write(Float.toString(f));
	     bout.newLine();
	    }
	    System.out.println("\nEnter GRADE");
	    while(sc.hasNext())
	    {
	     bout.write(Char.toString(ch));
	     bout.newLine();
	    }
	    bout.close();
	  }
	  catch(Exception e)
	  {
	  //if any I/O error occurs
	  e.printStackTrace();
	  }
	}
}