package by.htp.bookstore.run;

import by.htp.bookstore.domain.vo.Catalog;
import by.htp.bookstore.service.BookService;
import by.htp.bookstore.service.impl.BookServiceImpl;
import by.htp.bookstore.view.SimpleUserOutputer;
import by.htp.bookstore.view.impl.ConsoleOutput;

public class MainController {

	public static void main(String[] args) {
		
		BookService bookService = new BookServiceImpl();
		SimpleUserOutputer outputer = new ConsoleOutput( );
		
		Catalog catalog = bookService.getBookCatalog();
		outputer.printBookCatalog(catalog);
		
	}

}
