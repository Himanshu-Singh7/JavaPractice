
public class Bike1 {
	int speed ;
	
	Bike1(){
		System.out.println("speed of bike : " + speed);
	}
	
	{
		speed = 100;
	}
	public static void main(String[] args) {
		Bike1 b1 = new Bike1();
		Bike1 b2 =  new Bike1();
		Bike1 b3 =  new Bike1();
	}

}
