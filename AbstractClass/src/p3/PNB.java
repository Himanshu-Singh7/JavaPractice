package p3;

public class PNB extends Bank {

	@Override
	int getRateOfInterest() {
		return 8;
	}

	public static void main(String[] args) {
		Bank b1 = new SBI();
		
		System.out.println("SBI rate of intrest :" +b1.getRateOfInterest()+ "%");
		
		PNB p1 = new PNB();
		
		System.out.println("SBI rate of intrest :" +p1.getRateOfInterest()+ "%");
	}
}
