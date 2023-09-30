package p1;

import java.util.Scanner;

public class A {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		int num  = scn.nextInt();
		findEvenOdd(num);
				
	}
	
	
	public static void findEvenOdd(int num) {
		
	if(num % 2 == 0) {
		System.out.println( num + "print even");
	}else {
		System.out.println(num + "print odd");
	}
		
		
	}

}
