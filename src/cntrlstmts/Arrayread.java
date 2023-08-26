package cntrlstmts;

import java.util.Scanner;

public class Arrayread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int size=sc.nextInt();
		int[] a=new int[size];
		
		
		
		System.out.println("enter numbers");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		
		System.out.println("entered numbers");
		for(int i=0;i<3;i++)
		{
			System.out.println(a[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
