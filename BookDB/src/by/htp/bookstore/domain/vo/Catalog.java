package by.htp.bookstore.domain.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import by.htp.bookstore.domain.entity.Book;

public class Catalog implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1072676787863749129L;
	private String title;
	private Date dateCreation;
	private List<Book> books;
	
	public Catalog() {
		// TODO Auto-generated constructor stub
	}
	
	public Catalog(String title, Date dateCreation) {
		super();
		this.title = title;
		this.dateCreation = dateCreation;
		
	}
	
	public Catalog(String title, Date dateCreation, List<Book> books) {
		super();
		this.title = title;
		this.dateCreation = dateCreation;
		this.books = books;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * @return the dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}
	
	/**
	 * @param dateCreation the dateCreation to set
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	/**
	 * @return the books
	 */
	public List<Book> getBooks() {
		return books;
	}

	/**
	 * @param books the books to set
	 */
	public void setBooks(List<Book> books) {
		this.books = books;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateCreation == null) ? 0 : dateCreation.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Catalog other = (Catalog) obj;
		if (dateCreation == null) {
			if (other.dateCreation != null)
				return false;
		} else if (!dateCreation.equals(other.dateCreation))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Catalog: title: " + title + ", dateCreation: " + dateCreation;
	}	
}
