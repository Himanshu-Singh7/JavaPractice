package p1;

public class OverloadingCalculation1 {
	
	void add(int x , long y) {
		System.out.println(x +y);
	}
	
	void add(int a,int b,int c) {
		System.out.println(a + b +c);
	}
	public static void main(String[] args) {
		OverloadingCalculation1 obj = new OverloadingCalculation1();
		obj.add(20, 20);
		obj.add(20, 20,20);
	}

}
