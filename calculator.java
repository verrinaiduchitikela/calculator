package cals;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		
		int x,y, addition , subtraction , multiply, division;
		
		Scanner ch = new Scanner(System.in);
		
		
		System.out.print("Enter Two Numbers : ");
		x = ch.nextInt();
		y =ch.nextInt();
		
		
		addition  = x+y ;
		subtraction = x-y ;
		multiply = x*y;
		division =x/y;
		 

	    System.out.println("Sum = " + addition);
	    System.out.println("Difference = " + subtraction);
	    System.out.println("Multiplication = " + multiply);
	    System.out.println("Division = " + division);
		

	}

}
