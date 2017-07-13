package lsn8;

public class ChangeLine {
	
	public static void changeLines( int[][] arr, int line1, int line2 ){
		int temp;
		for ( int i = 0; i < arr.length; i++ ){
			temp = arr[ line1 ][ i ];
			arr[ line1 ][ i ] = arr[ line2 ][ i ];
			arr[ line2 ][ i ] = temp;
		}
	}
}
