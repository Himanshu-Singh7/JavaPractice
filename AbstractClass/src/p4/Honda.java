package p4;

public class Honda extends Bike  {

	@Override
	void run() {
		System.out.println("running safely");
		
	}
	
	public static void main(String[] args) {
		Honda h1 = new Honda();
		h1.run();
		h1.changeGear();
	}

}
