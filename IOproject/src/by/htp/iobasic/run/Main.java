package by.htp.iobasic.run;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;


public class Main {
	
	public static void main( String[] args ){
		
		try {
			InputStream is = new FileInputStream ( "c:\\temp\\text2.txt" );
			BufferedInputStream bis = new BufferedInputStream( is );
			
			byte[] a = new byte[ 10 ];

			/*while ( bis.available() ) {
				System.out.println( a );
			}*/
			
		}
		catch( IOException e ) {
			
		}
		
	}
	
}

/*public class Main {

	public static void main(String[] args) {
		Reader reader;
		Reader reader2;
		BufferedReader br;
		Writer writer;
		String fileName = "C:\\temp\\text.txt";
		String fileName2 = "C:\\temp\\text2.txt";
		File file;
		
		try {
			reader = new FileReader( fileName );
			file = new File( fileName2 );
			reader2 = new FileReader ( file );
			br = new BufferedReader( reader2 );
			
			while ( br.ready() ) {
				System.out.println( br.readLine() );
			}
			
		}
		catch (FileNotFoundException e) {
			System.out.println("File " + fileName + " is not found ");
	
		}
		catch ( IOException e ) {
			System.out.println( "IOException" );
		}
		

	}

}*/
