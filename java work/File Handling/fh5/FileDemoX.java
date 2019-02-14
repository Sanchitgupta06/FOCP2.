import java.io.*;
import java.util.*;
class FileDemoX
{
	public static void main(String[] args)
	{
		char ch;
	  File f=null;
	  try
	  {
	    f=new File("fileX.txt");
	    FileWriter fout=new FileWriter(f);
	    BufferedWriter bout=new BufferedWriter(fout);
	    Scanner in=new Scanner(System.in);
	    do{
	    System.out.println("\nEnter SERIAL NO");
	    int i=in.nextInt();
	     bout.write(Integer.toString(i));
	     bout.newLine();
	     in.nextLine();
	    
	    System.out.println("\nEnter NAME");
	     bout.write(in.nextLine());
	     bout.newLine();
	  
        System.out.println("\nEnter CGPA");
	     float x=(float)in.nextDouble();
	     bout.write(Float.toString(x));
	     bout.newLine();
	    
	    System.out.println("\nEnter GRADE");
	     bout.write(in.next().charAt(0));
	     bout.newLine();
	     System.out.println("To make Further entries press 'y'");
	     ch=in.next().charAt(0);
       }
       while(ch=='y');
	    bout.close();
	    System.out.println("\n");
	    FileReader fin=new FileReader(f);
	    BufferedReader bin=new BufferedReader(fin);
	    String sr;
	    System.out.println("The contents of FILE are: ");
	    while((sr=bin.readLine())!=null)
         {
	       System.out.println(sr);
         }
	}
	catch(Exception e)
	 {
		e.printStackTrace();
	}
  }
}