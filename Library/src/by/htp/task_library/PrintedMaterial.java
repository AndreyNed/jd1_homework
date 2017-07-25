package by.htp.task_library;

public abstract class  PrintedMaterial {
	
	private String title;
	private Author author;
	private int publishYear;
	private String type = "";
	
	public PrintedMaterial(String title, Author author, int publishYear, String type) {
		super();
		this.title = title;
		this.author = author;
		this.publishYear = publishYear;
		this.type = type;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public int getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String toString() {
		return title + " - " + author + " - " + publishYear + " - " + type;
	}
}
