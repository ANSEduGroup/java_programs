class Student
{
int rollnumber;
void getNumber(int n)
{
rollnumber=n;
}
void putNumber()
{
System.out.println("Roll no:"+rollnumber);
}
}
class Test extends Student
{
float part1,part2;
void getMarks(float m1,float m2)
{
part1=m1;
part2=m2;
}
void putMarks()
{
System.out.println("marks obtained:" + "\npart1=" + part1 + "\n part2=" +part2);
}
}
interface Sports
{
float sportwt=6.0f;
void putwt();
}
class Result extends Test implements Sports
{
float total;
public void putwt()
{
System.out.println("sports wt="+sportwt);
}
void display()
{
total=part1+part2+sportwt;
putNumber();
putMarks();
putwt();
System.out.println("total score="+total);
}
}
class Hybrid
{
public static void main(String args[])
{
Result student1=new Result();
student1.getNumber(1234);
student1.getMarks(27.5f,33.0f);
student1.display();
}
}

