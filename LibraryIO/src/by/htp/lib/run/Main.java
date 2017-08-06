package by.htp.lib.run;

import java.io.IOException;

import by.htp.lib.Library;
import by.htp.lib.console.IOConsole;
import by.htp.lib.io.LibIO;

public class Main {

	public static void main(String[] args) {
		Library lib1 = new Library( "The best" );
		
		try {
			LibIO.readDefault( lib1 );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		IOConsole.printEditions( lib1 );

	}

}
