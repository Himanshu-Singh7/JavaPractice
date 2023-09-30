package p1;

public class A6 implements Printable {
	
	@Override
	public void print() {
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
		A6 obj = new A6();
		obj.print();
	}

}
