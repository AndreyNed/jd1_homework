package by.htp.file_io.run;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
	
	public static void test1() throws IOException {
		
File file = new File( "data/data.dat" );
		
		if ( file.exists() ) {
			
			DataOutputStream outStream;
		
			outStream = new DataOutputStream( new BufferedOutputStream( new FileOutputStream( file ) ) );
			
			outStream.writeBytes("Hello, World!!\n");
			outStream.writeBytes("One line more");
					
			outStream.close();
			
			//reading char by char
			System.out.println("reading char by char");
			System.out.println("---------------------");
			DataInputStream inpStream;
			inpStream = new DataInputStream( new BufferedInputStream( new FileInputStream( file ) ) );
			long size = file.length();
			System.out.println( size );
			for ( long i = 0; i < size / 2; i++ ) {
				System.out.print( inpStream.readChar() );
			}
			System.out.println();
			inpStream.close();
			System.out.println();
			
			
			//read byte by byte and print separated by spaces
			System.out.println("read byte by byte and print separated by spaces");
			System.out.println("---------------------");
			inpStream = new DataInputStream( new BufferedInputStream( new FileInputStream( file ) ) );
			size = file.length();
			System.out.println( size );
			byte[] b = new byte[ ( int )size ];
			inpStream.read(b);
			for ( int i = 0; i < b.length; i++ ) {
				System.out.print( b[ i ] + " " );
			}
			inpStream.close();
			System.out.println();

			//read byte by byte and print as is
			System.out.println("read byte by byte and print as is");
			System.out.println("---------------------");
			inpStream = new DataInputStream( new BufferedInputStream( new FileInputStream( file ) ) );
			size = file.length();
			System.out.println( size );
			byte[] b1 = new byte[ ( int )size ];
			inpStream.readFully( b1 );
			System.out.println( b1 );
			String s = new String( b1 );
			System.out.println( s );
			for ( long i = 0; i < size; i++ ) {
				System.out.print( b1[ (int)i ] );
			}
			System.out.println();
			inpStream.close();
			System.out.println();
			
			//read char by char to array of char with reduced size twice if compare with file`s size,
			// create new String with this array of char
			System.out.println("read char by char to array of char with reduced size twice if compare with file`s size,");
			System.out.println("create new String with this array of char");
			System.out.println("---------------------");
			inpStream = new DataInputStream( new BufferedInputStream( new FileInputStream( file ) ) );
			size = file.length();
			System.out.println( size );
			size /= 2;
			char[] c = new char[ (int)size ];
			
			for ( long i = 0; i < size; i++ ) {
				c[ (int)i ] = inpStream.readChar();
			}
			s = new String( c );
			System.out.println( s );
			inpStream.close();
			System.out.println();
			
			inpStream = new DataInputStream( new BufferedInputStream( new FileInputStream( file ) ) );
			size = file.length();
			System.out.println( size );
			size /= 2;
			c = new char[ (int)size ];
			for ( long i = 0; i < size; i++ ) {
				c[ (int)i ] = inpStream.readChar();
			}
			s = new String( c );
			System.out.println( s );
			inpStream.close();
			
			char d = (char)101;
			System.out.println(d);
			
			//read until 64 ( eof )
			inpStream = new DataInputStream( new BufferedInputStream( new FileInputStream( file ) ) );
				byte eofCode = 65;
				byte inpByte = 0;
				try
				{
					while ( inpByte != eofCode ) {
						inpByte = inpStream.readByte();
						System.out.print( inpByte );
					}
				}
				catch ( EOFException eo ) {
					System.out.println();
					System.out.println("End of file");
				}
				System.out.println();
			inpStream.close();
			
		} else {
			System.out.println("Error: file " + file.getName() + " doesn`t exist" );
		}
		
	}
	
	public static void test2() {
		File file;
		
		file = new File( "data/data.dat" );
		if ( !file.exists() ) {
			try
			{
				file.createNewFile();
				System.out.println( "File " + file.getName() + " has been created successfully"  );
			}
			catch( Exception eo )
			{
				System.out.println( eo.getMessage() );
			}

		}
		try
		{
			DataOutputStream outS = new DataOutputStream( new BufferedOutputStream( new FileOutputStream( file ) ) );
			outS.writeUTF("This is test of UTF string write");
			outS.writeUTF("One more UTF string");
			outS.writeUTF("And again");
			outS.flush();
			outS.close();
		}
		catch ( FileNotFoundException eo ) {
			System.out.println( eo.getMessage() );
		}
		catch ( IOException eo ) {
			System.out.println( eo.getMessage() );
		}
	}
	
	public static void test3() {
		File file;
		
		file = new File ( "data/data.dat" );
		//if ( file.exists() ) {
			try
			{
				DataInputStream inpS = new DataInputStream( new BufferedInputStream( new FileInputStream( file ) ) );
				long fileLength = file.length();
				long isRed = 0;
				String newLine = "";
				
				//System.out.println( "File length: " + fileLength );
				while( isRed < fileLength ) {
					newLine = inpS.readUTF();
					isRed += ( (long)newLine.length() + 2 );
					if ( newLine != null ) {
						System.out.println( newLine );
					}
				}
				inpS.close();
			}
			catch ( FileNotFoundException eo )
			{
				System.out.println("Error: file is not found");
			}
			catch ( IOException eo )
			{
				System.out.println( "Error: I/O exception" );
			}
			
		//}
	}

	public static void main(String[] args) throws IOException {
		
		//test1();
		test2();
		test3();
		
	}
		
	
}
