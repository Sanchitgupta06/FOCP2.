import java.util.*;
class multipleexception
{
	public static void main(String args[])
	{
	try
	{
	int a[]=new int[5];
	a[4]=30/2;
	Scanner in=new Scanner(System.in);
	System.out.println("enter no.");
	int b=in.nextInt();
	}
	catch(ArithmeticException e)
	{
	System.out.println("task 1 completed");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
	System.out.println("task 2 completed");
	}
	catch(NumberFormatException e)
	{
	System.out.println("task 3 completed");
	}
	catch(NullPointerException e)
	{
		System.out.println("task 4 completed");
	}
	catch(IllegalArgumentException e)
	{
		System.out.println("task 5 completed");
	}
	System.out.println("rest of the code....");
	}
}
