package by.htp.lsn4;
import java.util.Scanner;

public class Blinov1B {

	static final int MAX_INDEX = 6;
	static final String ODD = "odd";
	static final String EVEN = "even";
	
	public static void printOut (int[] numbers, String mode){
		System.out.println("-------------------------------");
		if ( mode.equalsIgnoreCase(ODD) ) {
			System.out.println("The odd numbers are:");
		} else if ( mode.equalsIgnoreCase(EVEN) ){
			System.out.println("The even numbers are:");
		}
		for ( int i = 0; i < MAX_INDEX; i++ ){
			if ( ( ( numbers[ i ] % 2 ) != 0 ) && mode.equalsIgnoreCase(ODD)) {
				System.out.println( numbers[ i ] );
			} else if ( ( ( numbers[ i ] % 2 ) == 0 ) && mode.equalsIgnoreCase(EVEN) ){
				System.out.println( numbers[ i ] );
			}
		}
		
		System.out.println("-------------------------------");
	}
	
	public static void main(String[] args) {
		Scanner scInt = new Scanner(System.in);
		int[] numbers = new int[ MAX_INDEX ];
		
		System.out.println("Enter " + MAX_INDEX + "numbers:");
		for ( int i = 0; i < MAX_INDEX; i++ ){
			System.out.println(i+": ");
			numbers[ i ] = scInt.nextInt();
		}
		
		printOut ( numbers, EVEN );
		printOut ( numbers, ODD );
		scInt.close();
	}

}
