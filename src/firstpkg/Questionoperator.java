package firstpkg;

public class Questionoperator {

	public static void main(String[] args) {
	 
		//interchange each other value how?
		//with variable
		
		
		int a=20,b=30,c;
	
	  
	 System.out.println(c=a);
	 System.out.println(a=b);
	 System.out.println(b=c);
	 System.out.println("value of a="+a);
	 System.out.println("value of b="+b);
	 
	 //without variable
	 
	 int a1=20,b1=30;
	 
     System.out.println(a1=a1+b1);
     System.out.println(b1=a1-b1);
     System.out.println(a1=a1-b1);
     
     //write a program to check if two numbers 23 and 45 are equal?
     
     int a2=20,b2=45;
     
     System.out.println(a2==b2);
     
     //assign values of variables a and b as 55 and 70 respectively and then check if 
     //both the conditions a<50 and a<b are true
     
     int a3=55,b3=70;
     System.out.println(a3<50&&a3<b3);
     
     //int a=17; print 2nd digit
     
     int a4=17;
     System.out.println("print 2nd digit of a="+a4%10);
	 
	 
	    

	}

}
