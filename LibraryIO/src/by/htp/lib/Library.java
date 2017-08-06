package by.htp.lib;

public class Library {
	
	private String title;
	private Edition[] editions;
	private int nextIndex;
	private final int DEFAULT_INC_SIZE = 10;
	
	public Library() {
		super();
		title = null;
		editions = null;
	}

	public Library(String title, Edition[] editions) {
		super();
		this.title = title;
		this.editions = editions;
		nextIndex = editions.length;
	}

	public Library(String title) {
		super();
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Edition[] getEditions() {
		return editions;
	}

	public void setEditions(Edition[] editions) {
		this.editions = editions;
		nextIndex = editions.length;
	}
	
	public void addEdition( Edition edition ) {
		if ( edition != null ) {
			if ( editions == null ) {
				editions = new Edition[ DEFAULT_INC_SIZE ];
			} else if ( nextIndex >= editions.length ) {
				Edition[] oldEditions = editions;
				editions = new Edition[ editions.length + DEFAULT_INC_SIZE ];
				for ( int i = 0; i < oldEditions.length; i++ ){
					editions[ i ] = oldEditions[ i ];
				}
				nextIndex = oldEditions.length;				
			}
			editions[ nextIndex ] = edition;
			nextIndex++;
		}
	}
}
