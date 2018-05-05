import java.util.Scanner;
class Strrev{
	public static void main(String args[]){
		System.out.println("Enter the string");
		Scanner r=new Scanner(System.in);
		String str=r.nextLine();
		String rev=" ";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
	System.out.println("Reverse :-");
	System.out.println(rev);
}
}