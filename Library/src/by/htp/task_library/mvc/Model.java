package by.htp.task_library.mvc;
import by.htp.task_library.*;

public class Model {
	
	private final String BOOK = "book";
	
	private View view;
	private Library library;

	public View getView() {
		return view;
	}

	public Model setView(View view) {
		this.view = view;
		return this;
	}
	
	public Model booksToConsole() {
		view.printedMaterialsToConsole( getByType( BOOK ) );
		return this;
	}
	
	public Library getLibrary() {
		return library;
	}

	public Model setLibrary(Library library) {
		this.library = library;
		return this;
	}

	public Model setDefaultLibrary(){
		library = new Library();
		library.defaultInit();
		return this;
	}
	
	public Model addBookToLibrary( Book book ){
		library.addItem(book);
		return this;
	}
	
	public void helpToConsole(){
		view.showCommands();
	}
	
	public void showBooksByAuthor( String firstName, String lastName ) {
		Book[] books = library.getBooksByAuthor(firstName, lastName);
		view.printedMaterialsToConsole(books);
	}
	
	public void showSortedByAuthor(){
		view.printedMaterialsToConsole(library.getSortedBooksByAuthors());
	}
	
	private PrintedMaterial[] getByType ( String type ){
		PrintedMaterial[] result = new PrintedMaterial[ 0 ];
		int count = 0;
		for ( int i = 0; i < library.getItems().length; i++ ){
			if ( library.getItems()[ i ].getType().equalsIgnoreCase("book") ){
				count++;
			}
		}
		result = new PrintedMaterial[ count ];
		int j = 0;
		for ( int i = 0; i < library.getItems().length; i++ ) {
			if ( library.getItems()[ i ].getType().equalsIgnoreCase("book") ){
				result[ j ] = library.getItems()[ i ];
				j++;
			}
		}
		return result;
	}

}
