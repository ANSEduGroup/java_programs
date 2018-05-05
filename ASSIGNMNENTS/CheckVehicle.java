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
class Truck extends Vehicle{
	int load ;
	public Truck(int l){
		super(8,200);
		load=l;
	}
}
class CheckVehicle{
	public static void main(String args[]){
		Car c=new Car(5);
		Truck t=new Truck(10);
		System.out.println("Number of wheels of the car " +c.wheel);
		System.out.println("Speed of the car " +c.speed);
		System.out.println("Number of passengers of the car " +c.passenger);
		System.out.println("Number of wheels of the truck " +t.wheel);
		System.out.println("Speed of the truck "+t.speed);
		System.out.println("Load limit of the truk "+t.load);
		if(c.speed>t.speed)
			System.out.println("Car is faster than truck");
		else
			System.out.println("Car is slower than truck");
	}
}


