package by.htp.linklibr.libr;

import by.htp.linklibr.entity.Book;

public class NodeLibr {
	
	private NodeLibr previous;
	private NodeLibr next;
	private NodeLibr first;
	private NodeLibr last;
	private Book book;
	
	public NodeLibr() {
		// TODO Auto-generated constructor stub
	}

	public NodeLibr(NodeLibr previous, NodeLibr next, Book book) {
		super();
		this.previous = previous;
		this.next = next;
		this.book = book;
	}

	/**
	 * @return the previous
	 */
	public NodeLibr getPrevious() {
		return previous;
	}

	/**
	 * @param previous the previous to set
	 */
	public void setPrevious(NodeLibr previous) {
		this.previous = previous;
	}

	/**
	 * @return the next
	 */
	public NodeLibr getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(NodeLibr next) {
		this.next = next;
	}

	/**
	 * @return the book
	 */
	public Book getBook() {
		return book;
	}

	/**
	 * @param book the book to set
	 */
	public void setBook(Book book) {
		this.book = book;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((book == null) ? 0 : book.hashCode());
		result = prime * result + ((next == null) ? 0 : next.hashCode());
		result = prime * result + ((previous == null) ? 0 : previous.hashCode());
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
		NodeLibr other = (NodeLibr) obj;
		if (book == null) {
			if (other.book != null)
				return false;
		} else if (!book.equals(other.book))
			return false;
		if (next == null) {
			if (other.next != null)
				return false;
		} else if (!next.equals(other.next))
			return false;
		if (previous == null) {
			if (other.previous != null)
				return false;
		} else if (!previous.equals(other.previous))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "NodeLibr [previous=" + previous + ", next=" + next + ", book=" + book + "]";
	}
	
	

}
