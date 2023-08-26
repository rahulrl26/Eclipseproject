package firstpkg;

public class Switchcalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4,b=5;
		char c='+';
				
		switch(c) {
		
		case '+':System.out.println(a+b);
		break;
		case '-':System.out.println(a-b);
		break;
		case '*':System.out.println(a*b);
		break;
		case '/':System.out.println(a/b);
		break;
		default:System.out.println("invalid input");
		}
		
	}

}
      