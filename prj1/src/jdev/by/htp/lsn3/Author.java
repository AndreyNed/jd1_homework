package by.htp.lsn3;

public class Author {

	private String name;
	private String surname;
	private String fatherName;
	private int birthDate;
	
	public Author( String name, String fatherName, String surname, int birthDate ){
		this.name = name;
		this.fatherName = fatherName;
		this.surname = surname;
		this.birthDate = birthDate;
	}
	
	public String getName(){
		return name;
	}
	
	public String getFatherName(){
		return fatherName;
	}
	
	public String getSurname(){
		return surname;
	}
	
	public int getBirthDate(){
		return birthDate;
	}
	
}
