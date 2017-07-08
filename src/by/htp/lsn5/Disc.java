package by.htp.lsn5;

public class Disc {

	final int DEFAULT_COUNT = 5;
	private String title;
	private Composition[] compositions;
	private int lastCompositionIndex; //if is equals -1 then compositions == null || disc is full
	
	public Disc() {
		this.compositions = new Composition[ DEFAULT_COUNT ];
		defineCompositionIndex();
	}

	public Disc( String title, Composition[] compositions ) {
		this.title = title;
		this.compositions = compositions;
		defineCompositionIndex();
	}
	
	public Disc( String title, int compositionCount ) {
		this.title = title;
		this.compositions = new Composition [ compositionCount ];
		defineCompositionIndex();
	}
	
	private void defineCompositionIndex (){
		this.lastCompositionIndex = -1;
		
		if ( this.compositions != null ) {
			for ( int i = 0; i < this.compositions.length; i++ ) {
				if ( this.compositions[ i ] == null ) {
					this.lastCompositionIndex = i;
					break;
				}
			}
		}
		//System.out.println("lastCompositionIndex = " + this.lastCompositionIndex);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Composition[] getCompositions() {
		return compositions;
	}

	public void setCompositions(Composition[] compositions) {
		this.compositions = compositions;
		defineCompositionIndex();
	}
	
	public void setCompositions( int compositionsCount ){
		compositions = new Composition[ compositionsCount ];
		defineCompositionIndex();
	}
	
	public void addComposition ( Composition composition ){
		if ( composition != null ) {
			if ( lastCompositionIndex >= 0 ){
				compositions[ lastCompositionIndex ] = composition;
				composition.setPosition( lastCompositionIndex );
				lastCompositionIndex = ( lastCompositionIndex < (compositions.length - 1) ) ? ( lastCompositionIndex + 1 ) : -1;
				System.out.println("lastCompositionIndex = " + this.lastCompositionIndex);
			}
		}
	}
	
	public void addComposition ( String title, String style, int length ){
		if ( ( title != "" ) && ( style != "" ) && ( length > 0 ) ) {
			if ( lastCompositionIndex >= 0 ){
				compositions[ lastCompositionIndex ] = new Composition( title, length, style );
				compositions[ lastCompositionIndex ].setPosition( lastCompositionIndex );
				lastCompositionIndex = ( lastCompositionIndex < (compositions.length - 1) ) ? ( lastCompositionIndex + 1 ) : -1;
				System.out.println("lastCompositionIndex = " + this.lastCompositionIndex);
			}
		}
	}
	
	public int calculateCompositionsLength() {
		int length = 0;
		
		if ( compositions != null ) {
			for ( int i = 0; i < compositions.length; i++ ){
				if ( compositions[ i ] != null ) {
					length += compositions[ i ].getLength();
				} else {
					break;
				}
			}
		}
		return length;
	}
	
	public int calculateCompositionsCount() {
		int count = 0;
		
		if ( compositions != null ) {
			for ( int i = 0; i < compositions.length; i++ ) {
				if ( compositions[ i ] != null ) {
					count++;
				} else {
					break;
				}
			}
		}
		
		return count;
	}
	
	public String infoStr() {
		String info = "";
		int totalTime = calculateCompositionsLength();
		info = "Title: '" + this.title + "'; compositions` count: " + calculateCompositionsCount() + " / " + compositions.length + "; total time of compositions: " + Main.intLengthToString( totalTime );
		return info;
	}
	
}
