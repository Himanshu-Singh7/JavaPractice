package p4;

public class A7 implements Printable,Showable {

	@Override
	public void show() {
		System.out.println("hello");
		
	}

	@Override
	public void print() {
		System.out.println("welcome");
		
	}
	
	public static void main(String[] args) {
		A7 obj = new A7();
		obj.print();
		obj.show();
	}

}
