class Human{
	public void walk(){
		System.out.println("Human walks");
	}
}
class Boy extends Human{
	public void walk(){
		System.out.println("Boy walks");
	}
	public static void main(String args[]){
		Human obj=new Boy();
		obj.walk();
	}
}
