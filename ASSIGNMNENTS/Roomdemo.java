import java.util.Scanner;
class Room{
	double h,w,b;
	void calc(){
			double a=w*b*h;
			System.out.println("VOLUME OF THE ROOM :"+a);
		}
}
class Roomdemo {	
public static void main(String args[]){
	Room r=new Room();
	System.out.println("Enter the height,width and breadth");
	Scanner i=new Scanner(System.in);
	r.h=i.nextDouble();
	r.w=i.nextDouble();
	r.b=i.nextDouble();
	r.calc();
}
}
		
	