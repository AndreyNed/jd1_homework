package by.htp.taskLibrary;

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
	
	public void removeItemByTitle( String title ){
		
		if ( title != null && !title.equals("") ){
			if ( items != null ){
				int count = items.length;
				PrintedMaterial[] newItems = items;
				for ( int i = 0; i < items.length; i++ ){
					if ( title.equalsIgnoreCase( items[ i ].getTitle() ) ){
						items[ i ] = null;
						count--;
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
	}
	
	public Book[] sortBookByYear () {
		Book[] result = new Book[ 0 ];
		return result;
	}
	
	public Book[] searchBookByAuthorName( String name ){
		Book[] result = new Book[ 0 ];
		return result;
	}
	
	public void defaultInit() {
		Book[] books = new Book[ 5 ];
		books[ 0 ] = new Book( "Старик и море", "Эрнест", "Хемингуэй", 1952 );
		books[ 1 ] = new Book( "Маленький принц", "Антуан", "Сент-Экзюпери", 1940 );
		books[ 2 ] = new Book( "Алхимик", "Пауло", "Коэльо", 1988 );
		books[ 3 ] = new Book( "Путешествие в Икстлан", "Карлос", "Кастанеда", 2016 );
		books[ 4 ] = new Book( "Хоббит, или Туда и Обратно", "Рон Рональд Роуэл", "Толкиен", 1950 );
		this.items = books;
	}
	
}
