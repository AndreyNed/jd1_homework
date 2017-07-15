package by.htp.lsn3;

public class Book {
	
	private int pageCount;
	private int publishYear;
	private String title;
	private Author author;
	
	public Book ( int pageCount, int publishYear, String title, Author author ) {
		//System.out.println("Book constructor");
		this.pageCount = pageCount;
		this.publishYear = publishYear;
		this.title = title;
		this.author = author;
	}
	
	public void setPageCount(int count){
		pageCount = count;
	}
	
	public int getPageCount(){
		return pageCount;
	}
	
	public void setPublishYear( int publishYear ){
		this.publishYear = publishYear;
	}
	
	public int getPublishYear(){
		return publishYear;
	}
	
	public void setTitle( String title ) {
		this.title = title;
	}
	
	public String getTitle(){
		return title;
	}
	
	public void setAuthor( Author author ){
		this.author = author;
	}
	
	public Author getAuthor(){
		return author;
	}

}
