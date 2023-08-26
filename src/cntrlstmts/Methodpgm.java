package cntrlstmts;

public class Methodpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodpgm ob=new Methodpgm();
		int addvalue=ob.add();
		System.out.println(addvalue);
		
		ob.sub(30, 10);
		
		ob.mul(3,4);
		int mulvalue=ob.mul(3,4);
		System.out.println(mulvalue);
		
	}

	
	public int add()
	{
	int a=10,b=20;
	int c=a+b;
	return c;
	}
	
	
	
	//method without returntype and with parameter
	public void sub(int a,int b)
	{
		int c=a-b;
		System.out.println(c);
	}
	
	//method with returntype and with parameter
	public int mul(int a,int b)
	{
		int c=a*b;
		return c;
	}
	
	//method without returntype and without parameter
	public void div()
	{
	double  a=10,b=20;
	double divans;
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
