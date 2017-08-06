package by.htp.lib.console;

import by.htp.lib.Edition;
import by.htp.lib.Library;

public class IOConsole {
	
	public static void printEditions( Library lib ) {
		Edition[] editions = lib.getEditions();
		if ( editions != null && editions.length > 0 ) {
			int count = 0;
			System.out.println("Library: " + lib.getTitle());
			System.out.println("---------------------------------------------------");
			for ( int i = 0; i < editions.length; i++ ){
				if ( editions[ i ] != null ) {
					count++;
					System.out.println( count + ". " + editions[ i ].toString() );
				}
			}
			System.out.println("---------------------------------------------------");
			System.out.println("Total count: " + count);
		}
	}
	
}
