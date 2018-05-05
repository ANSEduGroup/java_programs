import java.io.*;
class Addex{
	public static void main(String args[])throws IOException{
		int a,b,c;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 2 numbers");
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		c=a+b;
		System.out.print("Sum of the numbers="+c);
		
}
}