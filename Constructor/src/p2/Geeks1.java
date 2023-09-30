package p2;
// Constructing overloading 
public class Geeks1 {
	
	 Geeks1(String name){
		System.out.println(name);
	}
     Geeks1(String name , int age){
		System.out.println(name + ":" + age);
	}
     Geeks1(long id){
    	 System.out.println(id);
 		
 	}
		
     public static void main(String[] args) {
    	 Geeks1 g1 = new Geeks1("Himanshu");
    	 Geeks1 g2 = new Geeks1("Himanshu" , 26);
    	 Geeks1 g3 = new Geeks1(10102288);
	}
}
