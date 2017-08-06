package by.htp.lib;

public class Book extends Edition {
	
	private Author author;
	private int pageCount;
	
	public Book(String title, Author author, String year, int pageCount) {
		super(title, year);
		this.author = author;
		this.pageCount = pageCount;
	}
	
	public Book(String title, String authorFirstName, String authorMiddleName,
			String authorLastName, String year, int pageCount) {
		super(title, year);
		this.author = new Author( authorFirstName, authorMiddleName, authorLastName );
		this.pageCount = pageCount;
	}
	
	public Book( String title ) {
		super(title, Edition.UNKNOWN);
		this.author = new Author( "", "", "" );
		this.pageCount = 0;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	public void setAuthor( String authorFirstName, String authorMiddleName, String authorLastName ) {
		this.author = new Author( authorFirstName, authorMiddleName, authorLastName );
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	@Override
	public String toString() {
		return "Book: " + this.getTitle() + ", author: " + author.toString() + ", was published: " + this.getYear() + ", page count: " + pageCount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + pageCount;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (pageCount != other.pageCount)
			return false;
		return true;
	}
}
