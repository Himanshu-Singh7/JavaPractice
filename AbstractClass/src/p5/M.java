package p5;

public class M extends B{

	@Override
	public void a() {
		System.out.println("I am a");
		
	}

	@Override
	public void b() {
		System.out.println("I am b");
		
	}

	@Override
	public void d() {
		System.out.println("I am d");
		
	}
	
	public static void main(String[] args) {
		M a = new M();
		a.a();
		a.b();
		a.c();
		a.d();
	}

}
