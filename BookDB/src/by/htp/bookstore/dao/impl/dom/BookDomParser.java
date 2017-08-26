package by.htp.bookstore.dao.impl.dom;

import java.util.List;

import by.htp.bookstore.dao.BookDao;
import by.htp.bookstore.dao.DaoException;
import by.htp.bookstore.domain.entity.Book;

	public class BookDomParser implements BookDao {
	@Override
	public List<Book> readBooks() {
		// implement SAX Parser here
		return null;
	}

	@Override
	public Book readBook(int id) throws DaoException {
		// Not to implement
		return null;
	}

	@Override
	public void deleteBook(int id) {
		// Not to implement
		
	}

	@Override
	public void addBook(Book book) throws DaoException {
		// Not to implement
		
	}

	@Override
	public void updateBook(Book book) {
		// Not to implement
		
	}
}
