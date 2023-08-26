package questions;

import java.util.Scanner;

public class Language {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter anything");
		Scanner sc=new Scanner(System.in);
		String lang=sc.nextLine();
				
		System.out.println(lang.endsWith("language"));
	}

}
