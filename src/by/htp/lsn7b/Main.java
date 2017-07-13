package by.htp.lsn7b;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	
	public static char[] inputChars () throws IOException {
		int itemIndex = 0;
		char[] chars = new char[ 40 ];
		char itemChar;
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		do {
			itemChar = (char)br.read();
			if ( itemChar != 13 ){
				chars[ itemIndex ] = itemChar;
				itemIndex++;
			}
		} while( itemChar != 13 );
	   	
		char[] newChars = new char[ itemIndex ];
		
		for ( int i = 0; i < itemIndex; i++ ){
			newChars[ i ] = chars[ i ];
		}
		
		return newChars;
	}
	
	public static void printChars( char[] chars ){
		for ( int i = 0; i < chars.length; i++ ){
			System.out.print( chars[ i ] );
		}
		System.out.println();
	}

	public static void main(String[] args) throws IOException {
		//char[] chars;// = new char[ 40 ];
		Student student1;
		Student student2;
		
		//chars = inputChars();
		System.out.println("Enter name:");
		student1 = new Student( inputChars() );
		
		System.out.println("Enter name:");
		student2 = new Student( inputChars() );
		
		System.out.println("Student`s name:");
		printChars( student1.getName() );
		
		System.out.println("Another student`s name:");
		printChars( student2.getName() );

	}

}
