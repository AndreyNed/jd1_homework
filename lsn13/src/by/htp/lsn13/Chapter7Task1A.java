package by.htp.lsn13;
/*Заменить в каждом слове символ в определенной позиции на заданный.
 Если слово короче, чем заданная позиция, то ничего не менять.*/

public class Chapter7Task1A {
	
	public static String replaceEachAtPos( String startStr, char sym, int pos ) {
		/*Решение с помощью StringBuffer*/
		StringBuilder sb = new StringBuilder( startStr.length() );
		sb.append(startStr);
		int index = 0;

		for ( int i = 0; i < sb.length(); i++ ) {
			index = ( sb.charAt( i ) == ' ' ) ? -1 : index;
			if ( index == ( pos - 1) ) {
				sb.setCharAt(i, sym );
			}
			index++;
		}
		return sb.toString().trim();
	}
	
}
