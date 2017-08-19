package by.htp.bookstore.dao.impl;

import java.util.ArrayList;
import java.util.List;

import by.htp.bookstore.dao.BookDao;
import by.htp.bookstore.domain.entity.Book;

public class BookFileImpl implements BookDao {

	@Override
	public List<Book> readBooks() {
		List <Book> books = new ArrayList<Book>();
		
		books.add( new Book(1, "Book1", 10) );
		books.add( new Book(2, "Book2", 20) );
		books.add( new Book(3, "Book3", 30) );
		books.add( new Book(4, "Book4", 40) );
		
		return books;
	}
}
