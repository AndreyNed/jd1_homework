package by.htp.interfaces.entity;

import java.util.Arrays;

public class Catalog {

	private Book[] books;
	private int bookCount;
	private final int STANDARD_SIZE = 10;

	public Catalog() {
		super();
		books = new Book[ STANDARD_SIZE ];
	}

	public Catalog(Book[] books) {
		super();
		this.books = books;
	}
	
	public Catalog( int defaultSize ) {
		if ( defaultSize > 0 ) {
		books = new Book[ defaultSize ];
		} else {
			books = new Book [ STANDARD_SIZE ];
		}
	}

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(books);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Catalog other = (Catalog) obj;
		if (!Arrays.equals(books, other.books))
			return false;
		return true;
	}
	
	public void addBook( Book book ) {
		if ( book != null ) {
			if ( bookCount >= books.length ) {
				Book[] booksOld = books;
				books = new Book[ bookCount + STANDARD_SIZE ];
				for ( int i = 0; i < booksOld.length; i++ ) {
					books[ i ] = booksOld[ i ];
				}
			}
			books[ bookCount ] = book;
			bookCount++;
		}
	}
	
}
