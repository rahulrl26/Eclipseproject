package cntrlstmts;

import java.util.Scanner;

public class Scannerprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter 2 number");

	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	
	System.out.println("enter your choice +,-,*,/");
	char c=sc.next().charAt(0);
	
	switch('+')
	{
	case '+':System.out.println("a+b="+(a+b));
	break;
	case '-':System.out.println("a-b"+(a-b));
	break;
	case '*':System.out.println("a*b"+(a*b));
	break;
	//case '/'
	}
	
	}

}
