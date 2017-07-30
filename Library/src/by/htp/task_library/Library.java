package by.htp.task_library;

public class Library {
	
	private String title;
	
	private PrintedMaterial[] items;

	public Library() {
		super();
	}

	public Library(String title) {
		super();
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}



	public PrintedMaterial[] getItems() {
		return items;
	}

	public void setItems(PrintedMaterial[] items) {
		this.items = items;
	}
	
	public void addItem( PrintedMaterial item ) {
		if ( item != null ) {
			if ( items == null ) {
				items = new PrintedMaterial[ 0 ];
			}
			PrintedMaterial[] newItems = items;
			items = new PrintedMaterial[ newItems.length + 1 ];
			for ( int i = 0; i < newItems.length; i++ ){
				items[ i ] = newItems[ i ];
			}
			items[ items.length - 1 ] = item;
		}
	}
	
	public Boolean removeItemByTitle( String title ){
		Boolean result = false;
		if ( title != null && !title.equals("") ){
			if ( items != null ){
				int count = items.length;
				PrintedMaterial[] newItems = items;
				for ( int i = 0; i < items.length; i++ ){
					if ( title.equalsIgnoreCase( items[ i ].getTitle() ) ){
						items[ i ] = null;
						count--;
						result = true;
					}
					newItems[ i ] = items[ i ];
				}
			    items = new PrintedMaterial[ count ];
			    int j = 0;
				for ( int i = 0; i < newItems.length; i++){
					if ( newItems[ i ] != null ){
						items[ j ] = newItems[ i ];
						j++;
					}
				}
			}
		}
		return result;
	}
	
	public Book[] getBooksByAuthor( String firstName, String lastName ) {
		Book[] booksA = new Book[ 0 ];
		int count = 0;
				
		for ( PrintedMaterial item : items ) {
			if ( item.getType().equalsIgnoreCase("book") ) {
				if ( item.getAuthor().getFirstName().equalsIgnoreCase(firstName) &&
				     item.getAuthor().getLastName().equalsIgnoreCase(lastName) )  {
				    	 count++;
				     }
			}
		}
		
		booksA = new Book[ count ];
		count = 0;
		
		for ( PrintedMaterial item : items ) {
			if ( item.getType().equalsIgnoreCase("book") ) {
				if ( item.getAuthor().getFirstName().equalsIgnoreCase(firstName) &&
				     item.getAuthor().getLastName().equalsIgnoreCase(lastName) )  {
					booksA [ count ] = (Book)item;
				    count++;
				}
			}
		}
		
		return booksA;
	}
	
	public Book[] getSortedBooksByAuthors() {
		Book[] books = new Book[ items.length ];
		int count = 0;
		for ( Book item: (Book[])items ) {
			if ( item.getType().equalsIgnoreCase("book") ) {
				books[ count ] = item;
				count++;
			}
		}
		Book[] finalBooks = new Book[ count ];
		
		for ( int i = 0; i < finalBooks.length; i++ ) {
			Book tempBook;
			Author author = books[ i ].getAuthor();
			count = 0;
			for ( int j = i + 1; j < finalBooks.length; j++ ) {
				if ( author.equals(books[ j ].getAuthor()) ) {
					count++;
					tempBook = books[ i + count ];
					books[ i + count ] = books[ j ];
					books[ j ] = tempBook;
				}
			}
		}
		
		for ( int i = 0; i < finalBooks.length; i++ ) {
			finalBooks[ i ] = books[ i ];
		}
		
		return finalBooks;
	}
	
	public void defaultInit() {
		Book[] books = new Book[ 7 ];
		books[ 0 ] = new Book( "Старик и море", "Эрнест", "Хемингуэй", 1952 );
		books[ 1 ] = new Book( "Маленький принц", "Антуан", "Сент-Экзюпери", 1940 );
		books[ 2 ] = new Book( "Алхимик", "Пауло", "Коэльо", 1988 );
		books[ 3 ] = new Book( "Путешествие в Икстлан", "Карлос", "Кастанеда", 2016 );
		books[ 4 ] = new Book( "Хоббит, или Туда и Обратно", "Рон Рональд Роуэл", "Толкиен", 1950 );
		books[ 5 ] = new Book( "Прощай, оружие", "Эрнест", "Хемингуэй", 1929 );
		books[ 6 ] = new Book( "Дар орла", "Карлос", "Кастанеда", 1981 );
		this.items = books;
	}
}
