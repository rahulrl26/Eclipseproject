package oops;

import java.util.Scanner;

interface Bank{
	public void accountdetails();
	public void withdrawal();
	public void deposit();
	public void balance();
}

class Sbi implements Bank{
	
	final String bankname="sbi";
	int accountno;
	String name;
	int balance=10000;
	Scanner sc=new Scanner(System.in);

	@Override
	public void accountdetails() {
		// TODO Auto-generated method stub
		System.out.println("enter account number");
		accountno=sc.nextInt();
		System.out.println("enter name");
		name=sc.next();
		System.out.println("bank name="+bankname);
		System.out.println("account number="+accountno);
		System.out.println("name of customer="+name);
		
		
	}

	@Override
	public void withdrawal() {
		// TODO Auto-generated method stub
		System.out.println("enter withdrawal amount");
		int withdrawalamount=sc.nextInt();
		balance=balance-withdrawalamount;
		System.out.println("current balance="+balance);
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("enter depositing amount");
		int deposit=sc.nextInt();
		balance=balance+deposit;
		System.out.println("balance="+balance);
		
	}

	@Override
	public void balance() {
		// TODO Auto-generated method stub
		System.out.println("balance="+balance);
		
	}
	
}


public class Bankapplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sbi s=new Sbi();
		s.accountdetails();
		s.withdrawal();
		s.deposit();
		s.balance();
		
		
		
		
	}

}
