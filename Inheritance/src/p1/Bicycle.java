package p1;

public class Bicycle {
	
	 int gear;
	 int speed;
	
	 Bicycle(int gear , int speed){
		 this.gear = gear;
		 this.speed = speed;
	 }
	 
	 public void speedbreak(int dec) {
		 speed = speed -dec;
	 }
	 
     public void speedup(int inc) {
		 speed = speed + inc;
	 }
     
    
     public String toString() {
    	 
    	 return ("No of gears are " + gear + " : "+"\nspeed of bicycle is " + speed);
    			 
     }

}
