package questions;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sum s=new Sum();
		Scanner sc=new Scanner (System.in);
		System.out.println("enter numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
				
		s.add(a,b,c);
		
		
	}

	
	public void add(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println("average="+d/3);
	}
}
