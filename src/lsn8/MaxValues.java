package lsn8;

public class MaxValues {
	
	public static int[] maxValuesArray( int[][] arr ){
		int[] fArr = new int[ arr[ 0 ].length ];
		int indexMax = 0;
		
		for ( int i = 0; i < fArr.length; i++ ){
			for ( int j = 0; j < arr.length; j++ ){
				if ( arr[ j ][ i ] > arr[ indexMax ][ i ] ){
					indexMax = j;
				}
			}
			fArr[ i ] = arr[ indexMax ][ i ];
		}
		return fArr;
	}

}
