
public class Bike2 {
	int speed;
	Bike2(){
		System.out.println("invoke constructor");
	}
	
	{
		System.out.println("instance instilizer invoke");
	}
	
     public static void main(String[] args) {
    	 Bike2 b1 = new Bike2();
    	 Bike2 b2 = new Bike2();
    	 Bike2 b3 = new Bike2();
    	 
	}
}
