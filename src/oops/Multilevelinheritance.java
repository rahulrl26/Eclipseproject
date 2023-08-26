package oops;

class Animal{
	public void animalfood()
	{
		System.out.println("meet,leaves");
	}
}

class Tiger extends Animal{
	public void Tigerfood()
	{
		System.out.println("meet");
	}
}

class Tigerbaby extends Tiger {
	public void babyfood()
	{
		System.out.println("milk");
	}
}










public class Multilevelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tigerbaby tb=new Tigerbaby ();
		tb.animalfood();
		tb.Tigerfood();
		tb.babyfood();
		
	}

}
