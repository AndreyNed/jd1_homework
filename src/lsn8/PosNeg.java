package lsn8;

public class PosNeg {

	public static void makePosNeg( int[] arr ){
		double n;
		for ( int i = 0; i < arr.length; i++ ){
			n = Math.random() * 100 - 50;
			if ( n < 0 ) {
				arr[ i ] *= -1;
			}
		}
	}
	
	public static int[] makeEvenPosArray( int[] arr ){
		int[] fArr = new int[ 1 ];
		int newLength = 0;
		
		if ( arr != null ){
			for ( int i = 0; i < arr.length; i += 2 ){
				if ( arr[ i ] > 0 ){
					newLength++;
				}
			}
			
			if ( newLength > 0 ) {
				fArr = new int[ newLength ];
				newLength = 0;
				for ( int i = 0; i < arr.length; i += 2 ){
					if ( arr[ i ] > 0 ){
						fArr[ newLength ] = arr[ i ];
						newLength++;
					}
				}
			}
		}
		return fArr;
	}
	
	public static int sumSquares( int[] arr ){
		int sum = 0;
		
		if ( arr != null ){
			for ( int i = 0; i < arr.length; i++ ){
				sum += arr[ i ] * arr[ i ];
			}
		}
		return sum;
	}
}
