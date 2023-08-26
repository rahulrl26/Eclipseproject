package oops;

interface Basicanimal{
	public void eat();
	public void sleep();
}

class Monkey2{
	public void jump()
	{
		System.out.println("monkey jump");
	}
	
	
	public void bite()
	{
		System.out.println("monkey bite");
	}
}


class Human extends Monkey2 implements Basicanimal{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}
	
	public void speak() {
		System.out.println("humanspeak");
	}

	
}



public class Monkey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human h=new Human();
		h.bite();
		h.eat();{
			System.out.println("food");
		}
		h.speak();
		
		
	}

}


