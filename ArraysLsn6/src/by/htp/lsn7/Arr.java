package by.htp.lsn7;

public class Arr {

	public static int[] fillInFromOne ( int[] aArr, int maxValue ) {
		
		for ( int i = 0; i < aArr.length; i++ ) {
			if ( i <= maxValue ) {
				aArr[ i ] = i + 1;
			} else {
				int k = ( i + 1 ) / maxValue;
				aArr[ i ] = i + 1 - maxValue * k;
			}
		}
		
		return aArr;
	}
	
	public static void printArr( int[] aArr ) {
		if ( aArr != null ){
			System.out.println("Array:");
			for ( int i = 0; i < aArr.length; i++ ) {
				System.out.println(i + ": " + aArr[ i ]);
			}
			System.out.println("-------------------------------");
		}
	}
	
	public static int[] deleteEvenItems( int[] aArr, String mode ) {
		int[] fArr = new int[ aArr.length ];
		int indexNew = 0;
		for ( int i = 0; i < aArr.length; i++ ){
			if ( ( i + 1 ) % 2 == 0 ){
				if ( mode.equalsIgnoreCase( Main.NOT_RESIZE ) ) {
					fArr[ indexNew ] = Main.DEFAULT_VALUE;
					indexNew++;
				} 
			} else {
				fArr[ indexNew ] = aArr[ i ];
				indexNew++;
			}
		}
		if ( mode.equalsIgnoreCase(Main.RESIZE) ){
			aArr = new int[ indexNew ];
		}
		
		for ( int i = 0; i < aArr.length; i++ ) {
			aArr[ i ] = fArr[ i ];
		}
		return aArr;
	}
	
	public static int[] deleteItemByIndex ( int[] aArr, int itemIndex, String mode ){
		int[] fArr = new int[ aArr.length ];
		int indexNew = 0;
		for ( int i = 0; i < aArr.length; i++ ){
			if ( i == itemIndex ){
				if ( mode.equalsIgnoreCase( Main.NOT_RESIZE ) ) {
					fArr[ indexNew ] = Main.DEFAULT_VALUE;
					indexNew++;
				} 
			} else {
				fArr[ indexNew ] = aArr[ i ];
				indexNew++;
			}
		}
		if ( mode.equalsIgnoreCase(Main.RESIZE) ){
			aArr = new int[ indexNew ];
		}
		
		for ( int i = 0; i < aArr.length; i++ ) {
			aArr[ i ] = fArr[ i ];
		}
		return aArr;
	}
	
}
