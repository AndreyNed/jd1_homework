package by.htp.interfaces.logic;

import java.util.Scanner;

import by.htp.interfaces.entity.Book;
import by.htp.interfaces.entity.Catalog;

public class LibrarianConsoleOperationImpl implements LibrarianOperation {

	private Scanner scLine = new Scanner( System.in );

	@Override
	public Catalog viewCatalog() {
		Catalog catalog = new Catalog();
		
		Book book1 = scanNewBook();
		Book book2 = scanNewBook();
		Book book3 = scanNewBook();
		Book book4 = scanNewBook();
		
		catalog.addBook(book1);
		catalog.addBook(book2);
		catalog.addBook(book3);
		catalog.addBook(book4);
		
		return catalog;
	}
	
	private Book scanNewBook(){
		Book book = null;
		
		book = new Book( scLine .nextLine() );
		return book;
	}

	@Override
	public Catalog sortCatalog(Catalog catalog) {
		// TODO Auto-generated method stub
		return null;
	}

}
