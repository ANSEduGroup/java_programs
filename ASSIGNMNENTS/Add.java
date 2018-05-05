import java.util.Scanner;
class Add{
	public static void main(String args[]){
		String str;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter two numbers");
		int x=s.nextInt();
		int y=s.nextInt();
		int z=x+y;
                  
                s.nextLine();

                System.out.println("Enter the string");
		str=s.nextLine();

		System.out.println("String is "+str);
		System.out.print("Sum ="+z);
}
}