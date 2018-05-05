import java.util.Scanner;
class Area{
public static void main(String args[]){

	float r;double a;
	Scanner i=new Scanner(System.in);
	System.out.println("Enter the radius of the circle");
	r=i.nextFloat();
	a=3.14*r*r;
	System.out.println("Area :"+a);
}
}	 
