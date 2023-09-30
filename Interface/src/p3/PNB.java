package p3;

public class PNB implements Bank {
   public static void main(String[] args) {
	   Bank b1 = new SBI();
	   Bank b2 = new PNB();
	   System.out.println("Intrest rate of SBI" + b1.rateOfInterest());
	   System.out.println("Intrest rate of PNB" + b2.rateOfInterest());
	   
 }

@Override
public float rateOfInterest() {
	// TODO Auto-generated method stub
	return 9.7f;
}
}
