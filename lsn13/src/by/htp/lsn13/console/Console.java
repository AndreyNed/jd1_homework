package by.htp.lsn13.console;

import java.util.Scanner;

public class Console {
	
	private static final String DEFAULT_TEXT = "За окном шел снег и рота красноармейцев";
	private static Scanner sc;
	
	public static String inputText( String message ) {
		System.out.println( message );
		sc = new Scanner( System.in );
		String input = sc.nextLine();
		input = ( input.equals("") ) ? DEFAULT_TEXT : input;

		return input;
	}
	
	public static void printStrToInt( String text ) {
		String text1 = text.toLowerCase();
		for ( int i = 0; i < text.length(); i++ ){
			if ( text1.charAt( i ) > 32 ) {
				System.out.print( (int)( text1.charAt( i ) - (int)'а' + 1 ) + " ");
			} else {
				System.out.print( " " );
			}
		}
		System.out.println();
	}
	
}
