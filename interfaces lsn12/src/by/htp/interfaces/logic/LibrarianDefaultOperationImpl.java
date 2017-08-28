package by.htp.interfaces.logic;

import by.htp.interfaces.entity.Book;
import by.htp.interfaces.entity.Catalog;

public class LibrarianDefaultOperationImpl implements LibrarianOperation{

	@Override
	public Catalog viewCatalog() {
		Catalog catalog = new Catalog();
		catalog.addBook(new Book( "Book1" ));
		catalog.addBook(new Book( "Book2" ));
		catalog.addBook(new Book( "Book3" ));
		catalog.addBook(new Book( "Book4" ));
		
		return catalog;
	}

	@Override
	public Catalog sortCatalog(Catalog catalog) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
