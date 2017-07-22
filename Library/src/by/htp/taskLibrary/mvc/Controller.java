package by.htp.taskLibrary.mvc;
import by.htp.taskLibrary.*;
import java.lang.Throwable;

import java.util.Scanner;

public class Controller {
	
	private final String EXIT = "exit";
	private final String OK = "ok";
	private final String PRINT = "print";
	private final String ADD_BOOK = "add book";
	
	private Model model;
	
	public Model getModel() {
		return model;
	}



	public void setModel(Model model) {
		this.model = model;
	}



	public void startCommandReading() {
		Scanner scLine = new Scanner( System.in );
		String command = "";
		
		while( !command.equalsIgnoreCase( EXIT ) ) {
			System.out.println("Enter your command:");
			command = scLine.nextLine();
			switch ( command ) {
				case EXIT:
					System.out.println("See you later!");
					break;
				case PRINT:
					if ( model != null ) {
						model.booksToConsole();
					}
					break;
				case ADD_BOOK:
					if ( model != null ) {
						addBook();
					}
					break;
			}
		}
		
	}
	
	private void addBook() {
		
		String title = readLine("Enter book`s title:");
		String firstName = readLine("Enter author`s first name:");
		String lastName = readLine("Enter author`s last name:");
		int year;
		try
		{
			year = Integer.valueOf(readLine("Enter publish year:"));
		}
		catch ( Throwable t )
		{
			year = 0;
			System.out.println("Error input: " + t.toString());
		}
		finally{
			
		}
		Book book = new Book(title, firstName, lastName, year );
		model.addBookToLibrary(book);
		
	}
	
	private String readLine( String message ){
		Scanner scLine = new Scanner( System.in );
		String result = "";
		String confirmation = "";
		while ( !confirmation.equalsIgnoreCase(OK) ){
			System.out.println( message );
			result = scLine.nextLine();
			System.out.println("You entered: " + result);
			System.out.println("Enter OK if confirm:");
			confirmation = scLine.nextLine();
		}
		return result;
	}

}
