package p2;

public class Circle extends Shape {

	@Override
	void draw() {
		System.out.println("Drawing Circle..");
		
	}
	public static void main(String[] args) {
		Shape sp1 = new Rectangle();
		Shape sp2 = new Circle();
		sp1.draw();
		sp2.draw();
	}

}
