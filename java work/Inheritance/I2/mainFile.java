import java.util.*;
class mainFile
{
	public static void main(String[] args)
	{
	Point3D p1=new Point3D(7.0f,4.0f,3.0f);
	System.out.println(p1.tostring());
	Scanner in=new Scanner(System.in);
	System.out.println("enter the value of a,b and c");
    float a=in.nextFloat();
    float b=in.nextFloat();
    float c=in.nextFloat();
    p1.setXYZ(a,b,c);
    float f[]=p1.getXYZ();
    System.out.println(f[0]+" "+f[1]+" "+f[2]);
	}
}