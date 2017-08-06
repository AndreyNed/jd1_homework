package by.htp.lib.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import by.htp.lib.Author;
import by.htp.lib.Book;
import by.htp.lib.Edition;
import by.htp.lib.Library;

public class LibIO {
	
	private static final String BOOK = "book";
	private static final String MAGAZIN = "magazin";
	private static final String DEFAULT_TYPE = "default";
	private static final String CUSTOM_TYPE = "custom";
	private static final String DEFAULT_LIB = "lib_db//default.txt";
	private static final String CUSTOM_LIB = "lib_db//custom.txt";
	
	public static void writeEditions ( String type, Library lib ) {
		String fileName = null;
		switch ( type.toLowerCase() ) {
			case DEFAULT_TYPE:
				fileName = DEFAULT_LIB;
				break;
			case CUSTOM_TYPE:
				fileName = CUSTOM_LIB;
				break;
		}
		File file = new File( fileName );
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter( new FileWriter( file ) );
			for ( int i = 0; i < lib.getEditions().length; i++ ) {
				//if (  )
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//bw.close();
		}
		
	}
	
	public static Edition[] readEditions ( String type, Library lib ) throws IOException {
		Edition[] result = null;
		String fileName = null;
		switch ( type.toLowerCase() ) {
			case DEFAULT_TYPE:
				fileName = DEFAULT_LIB;
				break;
			case CUSTOM_TYPE:
				fileName = CUSTOM_LIB;
				break;
		}
		File file = new File ( fileName );
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
		switch ( lines[ 0 ].toLowerCase() ) {
			case BOOK:
				result = ( Edition )stringToBook( lines );
				break;
			case MAGAZIN:
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
