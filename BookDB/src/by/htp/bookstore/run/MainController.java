package by.htp.bookstore.run;

import by.htp.bookstore.dao.DaoException;
import by.htp.bookstore.domain.entity.Book;
import by.htp.bookstore.domain.vo.Catalog;
import by.htp.bookstore.service.BookService;
import by.htp.bookstore.service.impl.BookServiceImpl;
import by.htp.bookstore.view.SimpleUserOutputer;
import by.htp.bookstore.view.impl.ConsoleOutput;

public class MainController {

	public static void main(String[] args) throws DaoException {
		
		BookService bookService = new BookServiceImpl();
		SimpleUserOutputer outputer = new ConsoleOutput( );
		
		Catalog catalog = bookService.getBookCatalog();
		outputer.printBookCatalog(catalog);
		
		//Book book = new Book( 10, "Book123", 123 );
		//bookService.addNewBook(book);
		
		System.out.println();
		//System.out.println("Catalog after adding new book");
		
		//catalog = bookService.getBookCatalog();
		//outputer.printBookCatalog(catalog);
		
		//System.out.println();
		
		//book = bookService.getBook(1);
		
		//System.out.println(book);
		
		
		//book = bookService.getBook(100);
		
		//System.out.println(book);
		
		
		
	}

}
