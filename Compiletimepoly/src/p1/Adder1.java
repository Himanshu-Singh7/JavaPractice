package p1;

public class Adder1 {
	
	public static int add(int x , int y) {
		return x + y;
	}
	
	public static double add(double x , double y) {
		
		return x + y;
	}
	
	public static void main(String[] args) {
		   
		System.out.println(Adder1.add(10, 20));
		System.out.println(Adder1.add(12.3, 12.6));
	}

}
