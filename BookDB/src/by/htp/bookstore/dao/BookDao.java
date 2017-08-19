package by.htp.bookstore.dao;

import java.util.List;

import by.htp.bookstore.domain.entity.Book;

public interface BookDao {
	
	List<Book> readBooks();
	
}
