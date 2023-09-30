package p2;

public class Engineer extends Employee {
	int benefits = 10000;
	
     public static void main(String[] args) {
    	 Engineer e = new Engineer();
    	 System.out.println("Salary of enginner: " + e.slary + "\nbenfit: " + e.benefits );
	}
}
