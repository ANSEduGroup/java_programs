import java.util.Scanner;
class Fibo{
public static void main(String args[]){
	int n1=0,n2=1,n3,i,n;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	n=s.nextInt();
	for(i=0;i<n;i++){
		if(i<=1)
			System.out.println(i);
		else{
		n3=n1+n2;
		
		n1=n2;
		n2=n3;
		System.out.println(n3);}}
}
}