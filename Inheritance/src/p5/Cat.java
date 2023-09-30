package p5;

public class Cat extends Animal {
	
	public void makeSound(){
		System.out.println("Mew");
	}
	
	public static void main(String[] args) {
		Animal a = new Animal();
		a.makeSound();
		Cat c = new Cat();
		c.makeSound();
		
	}

}
