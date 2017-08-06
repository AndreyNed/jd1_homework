package by.htp.lib.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import by.htp.lib.Author;
import by.htp.lib.Book;
import by.htp.lib.Edition;
import by.htp.lib.Library;

public class LibIO {
	
	private static final String DEFAULT_LIB = "lib_db//default.txt";
	
	public static Edition[] readDefault ( Library lib ) throws IOException {
		Edition[] result = null;
		File file = new File ( DEFAULT_LIB );
		if ( file.exists() ) {
			//System.out.println("File of default library has been found!");
			BufferedReader br = null;
			try {
				String[] lines = new String[ 100 ];
				br = new BufferedReader( new FileReader( file ) );
				int i = 0;
				while ( br.ready() ) {
					lines[ i ] = br.readLine();
					//System.out.println( lines[ i ] );
					lib.addEdition( stringToEdition( lines[ i ] ) );
				}
			} catch ( IOException e ) {
				System.out.println("IO exception has been happend in reading of default library: " + file.getName());
			} finally {
				br.close();
			}
		} else {
			System.out.println("File of default library is not found");
		}
		
		return result;
	}
	
	public static Edition stringToEdition( String line ) {
		String[] lines = line.split("[|]");
		Edition result = null;
		switch ( lines[ 0 ] ) {
			case "book":
				result = ( Edition )stringToBook( lines );
				break;
			case "magazin":
				break;
		}
		return result;
	}
	
	private static Book stringToBook( String[] lines ) {
		Author author = stringToAuthor( lines[ 1 ] );
		return new Book( lines[ 2 ], author, lines[ 4 ], Integer.parseInt(lines[ 3 ]) );
	}
	
	public static Author stringToAuthor( String line ) {
		String first = "";
		String middle = "";
		String last = "";
		if ( line != null && line.length() > 0 ){
			String[] lines = line.split("[ ]");
			first = lines[ 0 ];
			if ( lines.length == 2 ) {
				middle = "";
				last = lines[ 1 ];
			} else if ( lines.length > 2 ) {
				middle = lines[ 1 ];
				last = lines[ lines.length - 1 ];
			} else {
				middle = "";
				last = "";
			}
		}
		return new Author( first, middle, last );
	}

}
