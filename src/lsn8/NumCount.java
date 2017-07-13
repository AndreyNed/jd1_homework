package lsn8;

public class NumCount {

	public static int getCount( int[][] arr, int number ){
		int count = 0;
		
		for ( int j = 0; j < arr.length; j++ ){
			for ( int i = 0; i < arr[ j ].length; j++ ){
				if ( arr[ j ][ i ] == number ){
					count++;
				}
			}
		}
		return count;
	}
	
}
