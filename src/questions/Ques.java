package questions;

import java.util.Scanner;

public class Ques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter a number");
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int sum=0;
		
		for(int i=1;i<=a;i++)
		{
			System.out.println(i);
			sum=sum+i;
		}
		
		{
			System.out.println("sum of numbers="+sum);
		}
		
		
		
	}

}
