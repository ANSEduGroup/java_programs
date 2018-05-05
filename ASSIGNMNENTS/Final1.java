import java.io.*;

abstract class Geometric_object
{
	String colour;
	double weight;
	Geometric_object()
	{
		colour="white";
		weight=1.0;
	}
	String getcolour()
	{
		return(colour);
	}
	double getweight()
	{
		return(weight);
	}
	abstract double find_area();
	abstract double find_circumference();
}

class Triangle extends Geometric_object
{
	double x,y,z;
	Triangle(double a,double b,double c)
	{
		x=a;
		y=b;
		z=c;
	}
	double find_area()
	{
		double s=(x+y+z)/2;
		double area=Math.sqrt(s*(s-x)*(s-y)*(s-z));
		return(area);
	}
	double find_circumference()
	{
	double c=x+y+z;
	return(c);
	}
}
class Final1
{
	public static void main(String argv[])throws IOException
	{
		DataInputStream in=new DataInputStream(System.in);
		System.out.println("enter the sides of the triangle");
		double a=Double.parseDouble(in.readLine());
		double b=Double.parseDouble(in.readLine());
		double c=Double.parseDouble(in.readLine());
		Triangle t=new Triangle(a,b,c);
		System.out.println("area is "+t.find_area());
		System.out.println("circumference is "+t.find_circumference());
	}
}
