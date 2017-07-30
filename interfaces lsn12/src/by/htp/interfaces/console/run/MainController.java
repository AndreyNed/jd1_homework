package by.htp.interfaces.console.run;

import by.htp.interfaces.entity.Catalog;
import by.htp.interfaces.logic.Librarian;
import by.htp.interfaces.logic.LibrarianDefaultOperationImpl;
import by.htp.interfaces.logic.LibrarianOperation;

public class MainController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Librarian librarian = new Librarian();
		
		
		Catalog catalog1 = librarian.viewCatalog();
		Catalog catalog2 = librarian.viewScannerCatalog();
		
		LibrarianOperation libOperation = new LibrarianDefaultOperationImpl();
		Catalog catalog3 = libOperation.viewCatalog();
		
		System.out.println();
		
	}

}
