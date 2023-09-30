package p2;

public class B {
	
	public static void main(String[] args) {
		
		A a1 = new A();
		a1.setId(111);
		a1.setUsername("himanshusingh0608@gmail.com");
		a1.setPassword("123456");
		a1.setEnabled(false);
		
		
		System.out.println(a1.getId());
		System.out.println(a1.getUsername());
		System.out.println(a1.getPassword());
		System.out.println(a1.isEnabled());
	}

}
