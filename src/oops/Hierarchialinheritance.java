package oops;


class Animal1{
	public void animalplace()
	{
		System.out.println("forest");
	}
}
class Lion extends Animal1{
	public void lionplace()
	{
		System.out.println("heat forest");
	}
}

class Tiger1 extends Animal1{
	public void tigerplace()
	{
		System.out.println("dense forest");
	}
}






public class Hierarchialinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lion l=new Lion();
		l.lionplace();
		l.animalplace();
		
		Tiger1 t=new Tiger1();
		t.animalplace();
		t.tigerplace();
		
	}

}
