interface Area{
	final static float pi=3.14f;
	float compute(float x,float y);}
class Rectangle implements Area{
	public float compute(float x, float y){
		return (x*y);}}
class Circle implements Area{
	public float compute(float x,float y){
		return (pi*x*x);}}
class Interfacetest{
	public static void main(String args[]){
		Rectangle r=new Rectangle();
		Circle c=new Circle();
		Area area;
		area=r;
		System.out.println("Area of the rectangle "+area.compute(10,20));
		area=c;
		System.out.println("Area of the circle "+area.compute(10,0));
	}
}	