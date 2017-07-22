package by.htp.taskLibrary.mvc;
import by.htp.taskLibrary.*;

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
	}

}
