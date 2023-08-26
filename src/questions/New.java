package questions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class New {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		FileInputStream f=new FileInputStream("E://Book1.xlsx");
		
		try {
		int a=10,b=0;
		double c=a/b;
		System.out.println(c);
		}
		catch(Exception d)
		{
			System.out.println(d.getMessage());
		
		}
		System.out.println("hi chellow");
		
		
		
		
		try {
		int [] a=new int [3];
		a[0]=1;
		a[1]=3;
		a[2]=3;
		System.out.println(a[3]);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("this is a array");
		}
		System.out.println("hwllo");
	}

}
