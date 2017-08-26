package by.htp.bookstore.dao.impl.sax;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import by.htp.bookstore.dao.BookDao;
import by.htp.bookstore.dao.DaoException;
import by.htp.bookstore.domain.entity.Book;

public class BookSaxParser implements BookDao {

	@Override
	public List<Book> readBooks() {
		// implement SAX Parser here
		XMLReader reader = null;
		List books = new ArrayList<Book>();
		try {
			reader = XMLReaderFactory.createXMLReader();
			reader.setContentHandler( new BookHandler() );
			reader.parse("xml_docs/books.xml");
			
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return books; //change to return books
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
