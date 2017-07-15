package by.htc.lesson3;

import java.util.Scanner;

public class TaskA3RandomNumbers {
	
	final static String VERTICAL = "vertical";
	final static String HORIZONTAL = "horizontal";
	
	public static int inputCountOfNumbers() {
		int countNumbers = 0;
		Scanner scInt = new Scanner( System.in );
		
		System.out.println("Enter the count of random numbers: ");
		countNumbers = scInt.nextInt();
		scInt.close();
		return countNumbers;
	}
	
	public static void print( long[] numbers, String direction ){
		System.out.println("----------------------");
		System.out.println("Array of " + numbers.length + " numbers:");
		if ( direction.equalsIgnoreCase( VERTICAL ) ){
			for ( int i = 0; i < numbers.length; i++ ){
				System.out.println(i + ": " + numbers[ i ]);
			}
		} else if ( direction.equalsIgnoreCase( HORIZONTAL ) ){
			for ( int i = 0; i < numbers.length; i++ ){
				System.out.print(i + ": " + numbers[ i ]);
				if ( i < ( numbers.length - 1 ) ) {
					System.out.print("; ");
				} else {
					System.out.println("");
				}
			}
		}
		
		System.out.println("----------------------");
	}

	public static void main(String[] args) {
		
		int countNumbers = inputCountOfNumbers();
		long[] numbers = new long [ countNumbers ];
				
		for ( int i = 0; i < countNumbers; i++ ) {
			numbers[ i ] = Math.round(Math.random() * 10);
		};
				
		print ( numbers, VERTICAL );
		print ( numbers, HORIZONTAL );
		
	}

}
