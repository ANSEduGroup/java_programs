import java.io.*;
class Read{
	public static void main(String args[])throws IOException{
		int a=0;
		float b=0.0f;
		char c=' ';
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter an integer");
		a=Integer.parseInt(br.readLine());
		System.out.println("Enter a decimal");
		b=Float.parseFloat(br.readLine());
		System.out.println("Enter a character");
		c=(char)(br.read());
		System.out.println("value of a="+a);
		System.out.println("value of b="+b);
		System.out.println("value of c="+c);
}
}

