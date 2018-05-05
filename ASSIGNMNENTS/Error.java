class Error
{
public static void main(String args[])
{
int x=0;
int y;
try
{
y=3/x;
}
catch(ArithmeticException e)
{
System.out.println("Divide an integer by 0");
}
}
}
