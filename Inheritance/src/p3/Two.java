package p3;

public class Two extends One{
	
	public void printFor() {
		System.out.println("for");
	}
	public static void main(String[] args) {
		Two t =  new Two();
		
		t.printGeeks();
		t.printFor();
		t.printGeeks();
	}

}
