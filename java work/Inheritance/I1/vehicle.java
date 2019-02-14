import java.util.*;
class Vehicle
{
	 void display()
	{
	System.out.println("This is a VEHICLE");
	}
}
class Car extends Vehicle
{
	void display()
	{
	System.out.println("This is a CAR");
	}
}
class Bike extends Vehicle
{
    void display()
	{
	System.out.println("This is a BIKE");
	}
}

class mainClass
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no.of tyres");
		int num=in.nextInt();
		switch(num)
		{
			case 2:
			Bike b1=new Bike();
			b1.display();
			break;
			case 4:
			Car c1=new Car();
			c1.display();
			break;
            default :
            System.out.println("invalid");

		}
	}
}