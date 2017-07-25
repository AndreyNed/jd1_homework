package by.htp.task_library;

public class Book extends PrintedMaterial {

	public Book(String title, Author author, int publishYear) {
		super(title, author, publishYear, "book");
	}
	
	public Book( String title, String authorFirstName, String authorLastName, int publishYear ) {
		super(title, new Author( authorFirstName, authorLastName ), publishYear, "book");
		
	}
	
}
