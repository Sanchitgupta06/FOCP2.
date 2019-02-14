import java.util.*;
class myexception extends exception
{
	myException(String S)
	{
	Super(S);
	}
}
class checkException
{
	public static void main(String[] args)
	{
	 try
	 {
       throw new myException("my own exception");
	 }
	 catch(myException e)
	 {
	 	System.out.println(e);
	 }
	}
}