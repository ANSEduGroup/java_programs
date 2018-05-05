import DEMO_PACK.*;
class demotest2
{
public static void main(String args[])
{
DEMO_2 dm=new DEMO_2();
dm.setname("CIEM");
String name=dm.getname();
System.out.println("Name="+name);
dm.show();
int s=dm.sum(20,40);
System.out.println("Sum="+s);
}
}
