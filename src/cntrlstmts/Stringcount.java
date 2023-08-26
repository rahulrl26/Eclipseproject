package cntrlstmts;

public class Stringcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		Stringcount ob=new Stringcount();
		ob.vowelCount(s);
	}

	public void vowelCount(Strint s) {
		
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||(s.charAt(i)=='e'||(s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
					{
						count++;
					}
		}
		System.out.println("count="+count);
	}
	
	
	
	
	
	
	
	
	
	
}
