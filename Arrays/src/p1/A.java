package p1;


import java.util.Scanner;

public class A {
    public static void main(String[] args){
    	
    	try {
    		Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] cities = new int[n];
            for (int i = 0; i < n; i++) {
                cities[i] = sc.nextInt();
            }
            sc.close();
            int perfectCityIndex = findPerfectCity(cities, n);

            if (perfectCityIndex == -1) {
                System.out.println("No perfect city found.");
            } else {
                System.out.println("The left-most perfect city index is: " + perfectCityIndex);
            }
		} catch (Exception e) {
			e.printStackTrace();
			 
		
		}
        
       

       
    }

    public static int findPerfectCity(int[] cities, int n) {
        
        for (int i = 1; i < n; i++) {
            
            if (gcd(cities[i], cities[i-1]) != 1) {
                continue; 
            }
            
            double percentage = (double) cities[i] / 100;
            double prevPercentage = (double) cities[i-1] / 100;
            if (percentage > prevPercentage) {
                return i; 
            }
        }
        
        return -1;
    }

   
    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
