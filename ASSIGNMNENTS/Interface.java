interface inter1
{
void fun1();
}
interface inter2 extends inter1
{
void fun2();
float limit=23.99f;
}
class inter implements inter2
{
public void fun1()
{
System.out.println("fun1 method of interface 1");
}
public void fun2()
{
System.out.println("fun2 method of interface 2");
}
}
class Interface
{
public static void main(String argv[])
{
inter2 ref=new inter();
{
ref.fun1();
ref.fun2();
System.out.println("limit="+ref.limit);
}
}
}