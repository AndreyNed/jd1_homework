package by.htp.bookstore.view.impl;

import by.htp.bookstore.domain.entity.Book;
import by.htp.bookstore.domain.vo.Catalog;
import by.htp.bookstore.view.SimpleUserOutputer;

public class ConsoleOutput implements SimpleUserOutputer {

	@Override
	public void printBookCatalog( Catalog catalog ) {
		if ( catalog != null ){
			System.out.println("Catalog: " + catalog.getTitle());
			System.out.println("Date creation: " + catalog.getDateCreation());
			if ( catalog.getBooks() != null ){
				for( Book book: catalog.getBooks() ){
					System.out.println( book );
				}
			}
		}
		
	}


	
	
}
