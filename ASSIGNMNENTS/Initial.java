import java.util.Scanner;
class Initial{
public static void main(String args[]){
	String name;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the name");
	name=s.nextLine();
	System.out.println("Initial:");
	System.out.print(name.charAt(0));
	for(int i=1;i<name.length()-1;i++)
		if(name.charAt(i)==' ')
			System.out.print(name.charAt(i+1));
}
}