package p5;

public class B implements A {
	public static void main(String[] args) {
		B b1 = new B();
		b1.test(100);
	}

	@Override
	public void test(int x) {
		System.out.println(x);
		
	}

}
