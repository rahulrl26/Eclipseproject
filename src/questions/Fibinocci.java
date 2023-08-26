package questions;

public class Fibinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=10,a=0,b=1;
		for(int i=1;i<=n;i++)
		{
			System.out.println(a);
			int sum=a+b;
			a=b;
			b=sum;
		}
	}

}
