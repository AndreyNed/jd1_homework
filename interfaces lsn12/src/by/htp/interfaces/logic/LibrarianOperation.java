package by.htp.interfaces.logic;

import by.htp.interfaces.entity.Catalog;

public interface LibrarianOperation {
	
	double PI = 3.14;
	/*public static final*/
	
	Catalog viewCatalog();
	/*public abstract*/
	Catalog sortCatalog( Catalog catalog );
	
}
