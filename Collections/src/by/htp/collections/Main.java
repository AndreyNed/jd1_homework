package by.htp.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		
		HashSet <Book> books = new HashSet <Book>();
		books.add(new Book("one"));
		books.add(new Book("two"));
		books.add(new Book("three"));
		books.add(new Book("two"));
		
		for ( Book book : books ){
			//System.out.println(book.getTitle());
		}
		
		Book b1 = new Book("one");
		Book b2 = new Book("two");
		Book b3 = new Book("three");
		Book b4 = new Book("two");
		
		Map <Book, Integer> books1 = new HashMap <Book, Integer>();
		books1.put(b1, 100);
		books1.put(b2, 200);
		books1.put(b3, 300);
		books1.put(b4, 400);
		System.out.println("b1: " + b1.hashCode());
		System.out.println("b2: " + b2.hashCode());
		System.out.println("b3: " + b3.hashCode());
		System.out.println("b4: " + b4.hashCode());
		
		for ( Entry <Book, Integer> key: books1.entrySet() ){
			System.out.println(key.getKey().getTitle() + key.getKey().hashCode() + " : " + key.getValue());
		}
		
		System.out.println();
	}

	}


class Book {
	private String title;

	public Book() {

	}

	public Book(String title) {
		super();
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Book other = (Book) obj;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	

}

class ChildBook extends Book{
	
}