package cntrlstmts;

public class Methodpgmnew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodpgmnew ob=new Methodpgmnew();
		int addans=ob.add();
		System.out.println(addans);
		ob.sub(50, 20);
		ob.mul(4,5);
		System.out.println (ob.mul(4,5));
		ob.div();
	}

	//with return and without parameter
	
	public int add()
	{
	int a=1,b=2;
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
		double d=32,d1=43;
		double divans=d/d1;
		System.out.println(divans);
	}
	
	
	
	
	
	
	
	
	
	
	
}
