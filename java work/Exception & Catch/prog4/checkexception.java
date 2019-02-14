import java.util.*;
class myexception extends exception
{
	myexception(String S)
	{
	Super(S);
	}
}
class checkexception
{
	public static void main(String[] args)
	{
	 try
	 {
       throw new myexception("my own exception");
	 }
	 catch(myException)
	 {
	 System.out.println(e)
	 }
	}
}