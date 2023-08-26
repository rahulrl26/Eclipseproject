abstract package accesmodifier;

abstract class Car{
	abstract public void speedlimit();
	{
		System.out.println("carspeedlimit");
	}
	public void acceleration() {
		System.out.println("acc");
	}

}


class Volvo extends Car{

	@Override
	public void speedlimit() {
		// TODO Auto-generated method stub
		System.out.println("kia speedlimit");
		
		
	}
	
}







public class Mod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Volvo v=new Volvo();
		v.speedlimit();
		
		
		
	}

}
