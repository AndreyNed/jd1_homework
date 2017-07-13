package lsn8;

public class MinMaxExchange {
	public static int getMaxIndex( int[] arr ){
		int max = 0;
		
		for ( int i = 0; i < arr.length; i++ ){
			if ( arr[ i ] > arr[ max ] ) {
				max = i;
			}
		}
		
		return max;
	}
	
	public static int getMinIndex( int[] arr ){
		int min = 0;
		
		for ( int i = 0; i < arr.length; i++ ){
			if ( arr[ i ] < arr[ min ] ) {
				min = i;
			}
		}
		
		return min;
	}
	
	public static void exchangeItems( int[] arr, int first, int second ) {
		int item;
		
		if ( arr != null ) {
			item = arr[ first ];
			arr[ first ] = arr[ second ];
			arr[ second ] = item;
		}
	}
}
