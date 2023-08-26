package firstpkg;

public class Operator {

	public static void main(String[] args) {
		  //Arithmetic operators
				int a=10,b=20;
				System.out.println("value of a+b="+(a+b));
				System.out.println("value of a-b="+(a-b));
				System.out.println("value of a*b="+(a*b));
				System.out.println("value of a/b="+(a/b));
				System.out.println("value of a%b="+(a%b));
				
				//Assignment operators
				System.out.println(a+=b);
				System.out.println(a-=b);
				System.out.println(a*=b);
				System.out.println(a/=b);
				
				//Relational operator
				System.out.println(a<b);
				System.out.println(a>b);
				System.out.println(a>=b);
				System.out.println(a<=b);
				System.out.println(a!=b);
				System.out.println(a==b);
				
				//Logical operator
			    String username="abc123";
			    String pswd="1234";
			    
			    System.out.println(username=="abc123"&&pswd=="1234");
			    System.out.println(!(username=="abc123"));
			    System.out.println(username=="abc1235"||pswd=="1234");
				
			    
			    //unary operator
			    
			    int v=5;
			    System.out.println(v++);
			    System.out.println(v);
			    System.out.println(++v);
			    
			    System.out.println(v--);
			    System.out.println(v);
			    System.out.println(--v);
			    
			    //ternary operator
			    int v1=5,v2=2;
			    int s=v1>v2?v1:v2;
			    System.out.println(s);
			    
			    
				
				
				
			

	}

}
