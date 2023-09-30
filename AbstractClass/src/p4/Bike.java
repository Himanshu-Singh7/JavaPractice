package p4;

public abstract class Bike {
	Bike(){
		System.out.println("bike is created");
	}
	//incompleate method
	abstract void run();
	//Complete method 
	public void changeGear() {
		System.out.println("Change gear");
	}
}
