package by.htp.lsn5;

public class View {

	public void printDiscInfo( Disc disc ){
		
		if ( disc != null ) {
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

	}

}
