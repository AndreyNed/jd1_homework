package by.htp.lsn5;
/**Audiorecords*/
/**Blinov p.127 no.5B*/

public class Main {

	public static String intLengthToString( int lengthSec ){
		String strLength = "";
		int h = 0;
		int m = 0;
		int s = 0;
		
		s = lengthSec % 60;
		m = (lengthSec - s ) / 60;
		h = m / 60;
		m -= h * 60;
		
		strLength = h + " hours, " + m + " minutes, " + s + " seconds";		
		return strLength;
	}
	
	public int hmsToSeconds ( int hours, int minutes, int seconds ) {
		int secValue = 0;
		secValue = seconds + minutes * 60 + hours * 3600;
		
		return secValue;
	}
	
	public static void printDiscInfo( Disc disc ){
		int count = disc.calculateCompositionsCount();
		
		System.out.println( "------------------------------------------------" );
		System.out.println( "Disc: ");
		System.out.println( "     " + disc.infoStr() );
		
		for ( int i = 0; i < count; i++ ) {
			System.out.println( "------------------------------------------------" );
			System.out.println( "     " + "Composition:");
			System.out.println( "     " + disc.getCompositions()[ i ].infoStr() );
		}
	
		System.out.println( "------------------------------------------------" );

	}
	
	public static void main(String[] args) {
		Composition comp1 = new Composition ( "Smoke on the water", 485, "rock" );
		
		comp1.setPosition(3);
		
		Disc disc1 = new Disc();
		disc1.setTitle( "The best" );
		
		disc1.addComposition( comp1 );
		disc1.addComposition("Soldier of fortune", "rock", 549 );
		
		printDiscInfo( disc1 );
		
	}

}
