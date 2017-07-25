package by.htp.task_library.mvc;
import by.htp.task_library.*;

public class View {
	
	private Model model;

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}
	
	public void printedMaterialsToConsole ( PrintedMaterial[] items ) {
		System.out.println("------------------------------------------------------------");
		for ( int i = 0; i < items.length; i++ ) {
			System.out.println( "    " + ( i + 1 ) + ": " + items[ i ].toString() );
		}
		System.out.println();
		System.out.println("    Total items` count: " + items.length);
		System.out.println("------------------------------------------------------------");
		System.out.println();
	}
	
	public void showCommands() {
		System.out.println("---------- COMMANDS: ----------------------------------");
		System.out.println("help           - shows commands");
		System.out.println("print          - shows list of books");
		System.out.println("add book       - adds book to library");
		System.out.println("remove         - removes book from the library by title");
		System.out.println("show by author - shows commands");
		System.out.println("sort by author - shows sorted by author books");
		System.out.println("exit           - exit from application");
		System.out.println("--------------------------------------------------------");
		System.out.println();
	}

}
