class Array
{
public static void main(String args[])
{
int[] a=new int[10];
int x;
try
{
a[15]=25;
}
catch(ArithmeticException e)
{
System.out.println("Array index out of bound");
}
}
}