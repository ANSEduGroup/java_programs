class Room{
	float h,w,b;
class Roomdemo extends Room{
		void calc(float w,float h,float b){
			float a=w*b*h;
			System.out.println("VOLUME OF THE ROOM"+a);
		}}
public static void main(String args[]){
	Roomdemo r1=new Roomdemo();
	r1.calc(3,5,10);
}
}
		
	