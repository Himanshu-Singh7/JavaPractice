package p1;

public class Adder {
	
	 public static int add(int x , int y) {
		
		 return (x + y);
	 }
	
     public static int add(int x , int y , int z) {
		return (x + y + z);
		
	}
	
      public static void main(String[] args) {
    	  System.out.println(Adder.add(10, 20));
    	  System.out.println(Adder.add(10, 20,30));
    	  
	}
 }
