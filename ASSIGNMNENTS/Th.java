class Th
{
public static void main(String args[])
{
int i;
Thread t;
t=Thread.currentThread();
System.out.println(t);
t.setName("IT");
System.out.println(t);
try
{
for(i=1;i<=5;i++)
{
System.out.println(i);
Thread.sleep(200);
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}