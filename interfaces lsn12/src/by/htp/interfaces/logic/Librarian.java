package by.htp.interfaces.logic;

import java.util.Scanner;

import by.htp.interfaces.entity.Book;
import by.htp.interfaces.entity.Catalog;

public class Librarian {
	
	private Scanner scLine = new Scanner( System.in );
	
	public Catalog viewCatalog() {
		
		Catalog catalog = new Catalog();
		catalog.addBook(new Book( "Book1" ));
		catalog.addBook(new Book( "Book2" ));
		catalog.addBook(new Book( "Book3" ));
		catalog.addBook(new Book( "Book4" ));
		
		
		return catalog;
		
	}
	
	public Catalog viewScannerCatalog() {
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
		
		book = new Book( scLine.nextLine() );
		return book;
	}
	
}
