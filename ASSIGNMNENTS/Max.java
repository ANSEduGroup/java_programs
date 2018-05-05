import java.util.Scanner;
class Max{
public static void main(String args[]){
int a[];
int n,i,max,min;
a=new int[20];
Scanner r=new Scanner(System.in);
System.out.println("enter the no of elements");
n=r.nextInt();
System.out.println("enter the elements:");
for(i=0;i<n;i++)
{
a[i]=r.nextInt();
}
max=a[0];
min=a[0];
for(i=1;i<n;i++)
{
if(a[i]>max)
max=a[i];
if(a[i]<min)
min=a[i];
}
System.out.println("max="+max);
System.out.println("min="+min);
}
}
