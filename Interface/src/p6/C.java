package p6;

public class C implements B{
    public static void main(String[] args) {
		C c1 = new C();
		c1.test1();
		c1.test2();
	}

	@Override
	public void test1() {
		System.out.println(10);
		
	}

	@Override
	public void test2() {
		System.out.println(20);
		
	}
}
