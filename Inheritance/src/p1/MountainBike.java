package p1;

public class MountainBike extends Bicycle {
	int seatHeight;
     MountainBike(int gear, int speed , int seatHeight) {
		super(gear, speed);
		this.seatHeight = seatHeight;
		
	}
     
     public void setHeight(int newValue)
     {
         seatHeight = newValue;
     }
     
     @Override
     public String toString() {
    	 return(super.toString() + "\nseat height is " + seatHeight); 
     }

	public static void main(String[] args) {
    	 MountainBike mb =  new MountainBike(3, 100, 25);
    	 System.out.println(mb.toString());
	}
}
