package by.htp.lsn13;

public class Chapter7Task1A {
	
	public static String replaceEachAtPos( String startStr, String sym, int pos ) {
		String result = null;
		StringBuilder sb = new StringBuilder( startStr.length() );
		sb.append(startStr);
		int index = 0;

		for ( int i = 0; i < sb.length(); i++ ) {
			if ( sb.charAt( i ) == ' ' ) {
				index = -1;
			}
			if ( index == pos ) {
				sb.replace(i, i, sym );
			}
			index++;
		}
		result = sb.toString().trim();
		return result;
	}
	
}
