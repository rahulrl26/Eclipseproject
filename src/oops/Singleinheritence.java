package oops;



class parent{
	
	public void job()
	
	{
		System.out.println("jobless");
	}
	
}

class child extends parent{
	
	public void tution()
	{
		System.out.println("firststd");
	}
	
}



public class Singleinheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		child c=new child();
		{
			c.job();
			c.tution();
		}
	}

}
