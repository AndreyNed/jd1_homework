package by.htp.lib;

public class Author {

	private String firstName;
	private String middleName;
	private String lastName;
	
	public Author(String firstName, String middleName, String lastName) {
		super();
		if ( firstName != null ) {
			firstName = firstName.trim();
		} else {
			firstName = "";
		}
		this.firstName = firstName;
		if ( middleName != null ) {
			middleName = middleName.trim();
		} else {
			middleName = "";
		}
		this.middleName = middleName;
		if ( lastName != null ) {
			lastName = lastName.trim();
		} else {
			lastName = "";
		}
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public String toString() {
		String middleName = ( this.middleName.length() > 0 ) ? ( " " + this.middleName ) : "";
		return firstName + middleName + " " + lastName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((middleName == null) ? 0 : middleName.hashCode());
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
		Author other = (Author) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equalsIgnoreCase(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equalsIgnoreCase(other.lastName))
			return false;
		if (middleName == null) {
			if (other.middleName != null)
				return false;
		} else if (!middleName.equalsIgnoreCase(other.middleName))
			return false;
		return true;
	}
}
