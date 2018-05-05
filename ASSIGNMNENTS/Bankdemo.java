import java.util.Scanner;
class Bank{
	String name,actype;
	
	double balance;int accno;
	
	void assign(int ano,String atype,String n ){
		accno=ano;
		actype=atype;
		name=n;
		balance=0;
	}

	void deposit(double d){
		 balance=balance+d;
			System.out.println("BALANCE :"+balance);
	}

	void withdraw(double w){
			if(actype.equalsIgnoreCase("S")){
				if(balance-w>=5000){
					balance=balance-w;		 
			System.out.println("BALANCE :"+balance);
	}
	else
		System.out.println("Transaction Not Possible");
	}


	else if(actype.equalsIgnoreCase("C")){
				if(balance-w>=1000){
					balance=balance-w;		 
			System.out.println("BALANCE :"+balance);
	}
	else
		System.out.println("Transaction Not Possible");
	}

	else
		System.out.println("WRONG CHOICE");
	}
	

	void display(){

		System.out.println("WELCOME TO BANK ACCOUNT");
		System.out.println("ACCOUNT HOLDER'S NAME :"+name);
		System.out.println("ACCOUNT TYPE:"+actype);
		System.out.println("ACCOUNT NO.:"+accno);
		System.out.println("BALANCE :"+balance);
		}
}

class Bankdemo{
public static void main(String args[]){

		Bank s=new Bank();		
		
		Scanner i=new Scanner(System.in);
		do{
		System.out.println("Press 1 for Account Information");
		System.out.println("Press 2 for Deposit");
		System.out.println("Press 3 for Withdraw");
		System.out.println("Press 4 for Account details");
		System.out.println("Press 5 for Exit");
		System.out.println("Enter the choice");
		int ch=i.nextInt();
	 	i.nextLine();
		switch(ch){
		case 1:
			System.out.println("Enter the name");
			String name=i.nextLine();

	 	 	System.out.println("Enter the account type");
			String type=i.nextLine();
			System.out.println("Enter the account number");
			int an=i.nextInt();

			s.assign(an,type,name);
			break;
		case 2:
			System.out.println("Enter the deposit amount");
			double b=i.nextDouble();
			System.out.println("Deposit Amt :"+b);
			s.deposit(b);
			break;
		case 3:
			System.out.println("Enter the withdraw amount");
			double c=i.nextDouble();
			System.out.println("Withdraw Amt :"+c);
			s.withdraw(c);
			break;
		case 4:s.display();
			break;
		case 5:System.exit(0);
			break;
		default:
			System.out.println("WRONG INPUT,TRY AGAIN");
		}
		}while(true);
			
			
			
}
}



/*

D:\Rintesh>javac Bankdemo.java

D:\Rintesh>java Bankdemo
Press 1 for Account Information
Press 2 for Deposit
Press 3 for Withdraw
Press 4 for Account details
Press 5 for Exit
Enter the choice
1
Enter the name
rintesh
Enter the account type
S
Enter the account number
123456
Press 1 for Account Information
Press 2 for Deposit
Press 3 for Withdraw
Press 4 for Account details
Press 5 for Exit
Enter the choice
4
WELCOME TO BANK ACCOUNT
ACCOuNT HOLDER'S NAME :rintesh
ACCOuNT TYPE:S
ACCOUNT NO.:123456
BALANCE :0.0
Press 1 for Account Information
Press 2 for Deposit
Press 3 for Withdraw
Press 4 for Account details
Press 5 for Exit
Enter the choice
2
Enter the deposit amount
10000
Deposit Amt :10000.0
BALANCE :10000.0
Press 1 for Account Information
Press 2 for Deposit
Press 3 for Withdraw
Press 4 for Account details
Press 5 for Exit
Enter the choice
4
WELCOME TO BANK ACCOUNT
ACCOuNT HOLDER'S NAME :rintesh
ACCOuNT TYPE:S
ACCOUNT NO.:123456
BALANCE :10000.0
Press 1 for Account Information
Press 2 for Deposit
Press 3 for Withdraw
Press 4 for Account details
Press 5 for Exit
Enter the choice
3
Enter the withdraw amount
5000
Withdraw Amt :5000.0
BALANCE :5000.0
Press 1 for Account Information
Press 2 for Deposit
Press 3 for Withdraw
Press 4 for Account details
Press 5 for Exit
Enter the choice
4
WELCOME TO BANK ACCOUNT
ACCOuNT HOLDER'S NAME :rintesh
ACCOuNT TYPE:S
ACCOUNT NO.:123456
BALANCE :5000.0
Press 1 for Account Information
Press 2 for Deposit
Press 3 for Withdraw
Press 4 for Account details
Press 5 for Exit
Enter the choice
3
Enter the withdraw amount
3000
Withdraw Amt :3000.0
transaction Not Possible
Press 1 for Account Information
Press 2 for Deposit
Press 3 for Withdraw
Press 4 for Account details
Press 5 for Exit
Enter the choice
5

D:\Rintesh>*/