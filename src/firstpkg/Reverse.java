package firstpkg;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int rev=0,r;
		while(n>0)
		{
			r=n%10;
			rev=rev*10+r;
			n=10/r;
					
		}
		
		System.out.println("reverse ="+rev);
		
		if(temp==rev)
			
		{
			System.out.println("palindrome");
		
		}
		else
		{
			System.out.println("palindrome");
		
		}
		
		
		}
		
		
		
		
}
