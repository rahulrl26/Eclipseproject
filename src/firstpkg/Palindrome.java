package firstpkg;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter something");
		String s=sc.next();
		
		String reverse="";
		for(int i=s.length()-1;ira>=0;i--)
		{
			reverse=reverse+s.charAt(i);
		}
		System.out.println(reverse);
		
		if(s.equals(reverse))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
		
		
		
		
		
		
		
	}

}
