package firstpkg;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Scanner sc=new Scanner(System.in);
	System.out.println("enter 2 numbers");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=a+b;
	String choice;
	do {
		System.out.println("do you want to continue y or n");
		choice=sc.next();
	}while (choice.equals("y"));
			
		
	}

}
