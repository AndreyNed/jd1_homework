package by.htp.lsn3;

public class Main {
	
	//private int lessonNumber = 3;
	
	public Main (){
		//System.out.println("Main constructor");
	}
	
	public static void printBookInfo(Book book){
		System.out.println("-------------------------------------------------");
		System.out.println("Book:");
		System.out.println("    title: " + book.getTitle());
		System.out.println("    publish year: " + book.getPublishYear());
		System.out.println("    page count: " + book.getPageCount());
		System.out.println("    author: " + book.getAuthor().getName() + ' ' +
				book.getAuthor().getFatherName() + ' ' + book.getAuthor().getSurname());
		System.out.println("-------------------------------------------------");
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Author author1 = new Author( "Александр", "Сергеевич", "Пушкин", 1797 );
		Author author2 = new Author( "Михаил", "Юрьевич", "Лермонтов", 1814 );
		
		Book book1 = new Book ( 250, 1811, "Няне", author1 );
		Book book2 = new Book ( 340, 1828, "Бородино", author2 );
		
		printBookInfo( book1 );
		printBookInfo( book2 );
		
		/*Book b1 = new Book( 300, 1999, "Title1", "Author1" );
		Book b2 = new Book( 500, 2000, "Title2", "Author2" );
		Main m1 = new Main();*/
		/*int book1_page = 345;
		int book1_publishYear = 1999;
		String book1_title = "Title1";
		String book1_author = "Author1";
		int book2_page = 540;
		int book2_publishYear = 2017;
		String book2_title = "Title2";
		String book2_author = "Author2";
		
		System.out.println("Book1: ");
		System.out.println("    page count: " + book1_page);
		System.out.println("    publish year: " + book1_publishYear);
		System.out.println("    title: " + book1_title);
		System.out.println("    author: " + book1_author);
		System.out.println("------------------------------------------");
		System.out.println("Book2: ");
		System.out.println("    page count: " + book2_page);
		System.out.println("    publish year: " + book2_publishYear);
		System.out.println("    title: " + book2_title);
		System.out.println("    author: " + book2_author);
		System.out.println("------------------------------------------");*/		
	}

}
