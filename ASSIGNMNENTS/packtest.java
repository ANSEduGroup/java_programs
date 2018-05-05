import DEMO_PACK.DEMO1;
class use extends DEMO1
{
public void display()
{
System.out.println("subclass in different package");
}
}
class packtest
{
public static void main(String args[])
{
use ob=new use();
ob.display();
ob.show();
int s=ob.sum(50,60);
System.out.println("sum="+s);
}
}
