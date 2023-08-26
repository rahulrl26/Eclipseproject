package questions;

import java.util.Scanner;

public class Largestelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temp=0;
		Scanner sc=new Scanner(System.in);
		{
			System.out.println("enter array size");
		}
		int size=sc.nextInt();
		int [] ar=new int [size];
		
		System.out.println("enter values");
		
		for(int i=0;i<=ar.length-1;i++)
		{
		ar[i]=sc.nextInt();
		if (ar[i]>temp);
		temp=ar[i];
		
			
		}
		
		System.out.println("largest value="+temp);
		
		
		
	}

}
