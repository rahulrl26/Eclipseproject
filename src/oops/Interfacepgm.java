package oops;

interface Cardetails51 {
    public void speedlimit();
    public void colour();
}

interface Carmodification51 {
    public void exhaust();
}

class Ferrari56 implements Cardetails51,Carmodification51 {

    @Override
    public void speedlimit() {
        System.out.println(100);
    }

    @Override
    public void colour() {
        System.out.println("red");
    }

	@Override
	public void exhaust() {
		
		System.out.println("loud");
	}

}

public class Interfacepgm {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
