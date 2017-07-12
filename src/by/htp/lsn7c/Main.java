package by.htp.lsn7c;

public class Main {
	
	public static final String FORWARD = "forward";
	public static final String BACKWARD = "backward";
	
	public static void changeValues ( int[] arr, int fromIndex, int toIndex ){
		int i = arr[ toIndex ];
		arr[ toIndex ] = arr[ fromIndex ];
		arr[ fromIndex ] = i;
	}
	
	public static int[] sort ( int[] arr, String mode ){
		if ( arr != null ) {
			switch ( mode ) {
			case FORWARD:
				for ( int i = 1; i < arr.length; i++ ){
					for ( int j = 0; j < arr.length - i; j++ ){
						if ( arr[ j ] > arr [ j + 1 ] ) {
							changeValues( arr, j, j + 1 );
						}
					}
				}
				break;
			case BACKWARD:
				for ( int i = 1; i < arr.length; i++ ){
					for ( int j = 0; j < arr.length - i; j++ ){
						if ( arr[ j ] < arr [ j + 1 ] ) {
							changeValues( arr, j, j + 1 );
						}
					}
				}
				break;
			default:
				System.out.println("Wrong mode of sorting...");
			}
		}
		return arr;
	}
	
	public static void print( int[] arr ){
		if ( arr != null ){
			System.out.println("-------Array:-------------------------------------------------------------------------------------------");
			for ( int i = 0; i < arr.length; i++ ) {
				System.out.print(i + ": " + arr[ i ] + "; ");
			}
			System.out.println();
			System.out.println("--------------------------------------------------------------------------------------------------------");
		}
	}

	public static void main(String[] args) {
		
		int[] arr1 = { 2, 5, 1, 0, 14, 3, 8, 11, 6, 4, 9, 13, 10, 7, 12 };
		
		print( arr1 );

		arr1 = sort ( arr1, FORWARD );
		print( arr1 );
		
		arr1 = sort ( arr1, BACKWARD );
		print( arr1 );
	}

}
