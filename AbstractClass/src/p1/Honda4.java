package p1;

public class Honda4 extends Bike {

	
	
	@Override
	void run() {
	   System.out.println("runing safely...");
		
	}
	
	public static void main(String[] args) {
		Bike obj = new Honda4();
		obj.run();
	}

}
