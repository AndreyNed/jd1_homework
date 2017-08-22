package by.htp.bookstore.service.impl;

import java.util.Date;
import java.util.List;

import by.htp.bookstore.dao.BookDao;
import by.htp.bookstore.dao.DaoException;
import by.htp.bookstore.dao.impl.BookFileImpl;
import by.htp.bookstore.dao.impl.BookMySQLImpl;
import by.htp.bookstore.domain.entity.Book;
import by.htp.bookstore.domain.vo.Catalog;
import by.htp.bookstore.service.BookService;

public class BookServiceImpl implements BookService {
	
	//change to Factory
	private BookDao dao = new BookMySQLImpl();
	//private BookDao dao = new BookFileImpl();	

	@Override
	public Catalog getBookCatalog() {
		
		List<Book> books = dao.readBooks();
		
		String catalogTitle = "Daily catalog";
		Date dateCreation = new Date();
		
		Catalog catalog = new Catalog( catalogTitle, dateCreation, books );
		
		return catalog;
	}

	@Override
	public void addNewBook(Book book) {
		if ( book != null ) {
			try {
				dao.addBook(book);
			} catch (DaoException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public Book getBook(int id) {
		Book book = null;
		if ( id != 0 ) {
			try {
				book = dao.readBook(id);
			} catch (DaoException e) {
				e.printStackTrace();
			}
		}
		return book;
	}
	
}
