import java.util.Scanner;
class Student{
	String name;
	double marks1,marks2,marks3;
	double total,avg;
	
	void assign(double m1,double m2,double m3,String n ){
		marks1=m1;
		marks2=m2;
		marks3=m3;
		name=n;
	}

void total(){
		 total=marks1+marks2+marks3;
		avg=total/3;	
		
	}

	void dispaly(){
		System.out.println("NAME :"+name);
		System.out.println("MARKS 1 :"+marks1);
		System.out.println("MARKS 2 :"+marks2);
		System.out.println("MARKS 3 :"+marks3);
		System.out.println("Total :"+total);
		System.out.println("AVERAGE :"+avg);}

}
class Studentdemo{
public static void main(String args[]){

		Student s=new Student();		
		
		Scanner i=new Scanner(System.in);

		System.out.println("Enter the name");
		String name=i.nextLine();


		System.out.println("Enter marks of 3 subjects");
		double marks1=i.nextDouble();
		double marks2=i.nextDouble();
		double marks3=i.nextDouble();
		s.assign(marks1,marks2,marks3,name);
		s.total();
		s.dispaly();
}
}