package cntrlstmts;

import java.util.Scanner;

public class Singledimentionsumavg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int size=sc.nextInt();
		int[] a=new int[size];
		
		
		System.out.println("enter numbers");
		int s=0;
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			s=s+a[i];
		}
		
		
		System.out.println("sum="+s);
		System.out.println("average="+s/3);
		
		for(int r:a)
		{
			System.out.println(r);
		}
				
		

		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}

}
