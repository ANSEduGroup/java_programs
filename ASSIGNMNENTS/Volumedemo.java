import java.io.*;
class Volume
{
 double vol;
 double calvol(double r)
{
vol=(4*r*r*r*3.14)/3;
return vol;
}
double calvol(int a)
{
vol=a*a*a;
return vol;
}
double calvol(double r, int h)
{
 vol=(3.14*r*r*h)/3;
 return vol;
}
}
class Volumedemo
{
public static void main(String arg[])throws IOException
{
double rad=Double.parseDouble(arg[0]);
int side=Integer.parseInt(arg[1]);
int h=Integer.parseInt(arg[2]);
double r=Double.parseDouble(arg[3]);
Volume ob= new Volume();
double v1=ob.calvol(rad);
double v2=ob.calvol(side);
double v3=ob.calvol(r,h);
System.out.println("sphere="+v1+"  cube="+v2+" Cone="+v3);
}
}
