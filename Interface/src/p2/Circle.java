package p2;

public class Circle implements Drawable {
    public static void main(String[] args) {
    	Drawable dr1 = new Circle();
    	Drawable dr2 = new Rectangle();
    	dr1.draw();
    	dr2.draw();
	}

	@Override
	public void draw() {
		System.out.println("draw the circle");
		
	}
}
