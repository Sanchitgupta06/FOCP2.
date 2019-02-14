import java.io.*;
class numRead
{
	File f=null;
	int[] N;
	void numfileread()
	{
		N=new int[10];
	try
	  {
	  	f=new File("num");
	   FileReader fin = new FileReader(f);
	   BufferedReader bin=new BufferedReader(fin);
	   for(int i=0;i<10;i++)
	   {
	   	N[i]=Integer.parseInt(bin.readLine());
	   }
	  }
	  catch(Exception e){}
	  for(int i=0;i<10;i++)
	  {
	  	System.out.println(N[i]+" ");
	  }
	}
	void numSort()
	{
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				if(N[i]>N[j])
				{
					int t=N[i];
					N[i]=N[j];
					N[j]=t;
				}
			}
		}
		System.out.println("new list");
		for(int i=0;i<10;i++)
		{
		  System.out.println(N[i]+" ");
		}
	}
	void numWrite()
	{
		try
	  {
		f=new File("num");
        FileWriter fout=new FileWriter(f);
        BufferedWriter bout=new BufferedWriter(fout);
        for(int i=0;i<10;i++)
        {
        	bout.write(Integer.toString(N[i]));
        	bout.newLine();
        }
       bout.close();
      }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
    }
}
class mainclass
{
	public static void main(String[] args)
	{
		numRead nr=new numRead();
		nr.numfileread();
		nr.numSort();
		nr.numWrite();
	}
}