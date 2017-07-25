package by.htp.task_library;

public class Author {
	
	private String firstName;
	private String lastName;

	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Author(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String toString() {
		return firstName + " " + lastName;
	}
	
	public boolean equals ( Author author ) {
		boolean result = false;
		if ( author.getFirstName().equalsIgnoreCase(this.firstName) &&
			 author.getLastName().equalsIgnoreCase(this.lastName) ) {
			result = true;
		}
		return result;
	}

}
