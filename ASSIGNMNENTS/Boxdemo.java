class Box{
	double l;double b;double h;
	Box(double x,double y,double z){
		l=x;
		b=y;
		h=z;
	}
	void vol(){
		double v;
		v=l*b*h;
		System.out.println("VOLUME :"+v);
	}
}
class Boxdemo{
	public static void main(String args[]){
		Box b=new Box(5,10,15);
		b.vol();
	}
}