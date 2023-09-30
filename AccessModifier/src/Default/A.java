package Default;

public class A {
	
	int x = 10;
	
	void display() {
		System.out.println("display");
	}
	
	public static void main(String[] args) {
		
		A a1 = new A();
		a1.display();
		System.out.println(a1.x);
	}

}
