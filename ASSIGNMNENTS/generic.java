class Vehicle{
int wheel,speed;
public Vehicle(int no,int s)
{
wheel=no;
speed=s;
}
}
class Car extends Vehicle{
int passenger;
public Car(int p){
super(4,100);
passenger=p;
}
}
class truct extends Vehicle{
int load ;
public truct(int l){
super(8,200);
load=l;
}
}
class CheckVehicle{
public static void main(String args[]){
car c=new car(5);
System.out.println("nmbr of wheels of the car" +5);
System.out.println("speed of the car" +c.speed);
System.out.println("nmbr of passengers of the car" +c.passenger);
System.out.println("nmbr of wheels of the truck" +t.wheel);
System.out.println("speed of the truck "+t.speed);
System.out.println("load limit of the truk "+t.load);
if(c.speed>t.speed)
System.out.println("car is faster than truck");
else
System.out.println("car is slower than truck");
}
}


