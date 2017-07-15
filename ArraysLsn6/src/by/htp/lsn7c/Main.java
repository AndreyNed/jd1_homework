package by.htp.lsn7c;

public class Main {
	
	public static final String FORWARD = "forward";
	public static final String BACKWARD = "backward";
	
	public static void changeIndexes ( int[] arr, int fromIndex, int toIndex ){
		int i = arr[ toIndex ];
		arr[ toIndex ] = arr[ fromIndex ];
		arr[ fromIndex ] = i;
	}
	
	public static int[] sort ( int[] arr, String mode ){
		int item;
		
		if ( arr != null ) {
			switch ( mode ) {
			case FORWARD:
				
				break;
			case BACKWARD:
				
				break;
			default:
				System.out.println("Wrong mode of sorting...");
			}
		}
		
		return arr;
	}
	
	public static void print( int[] arr ){
		if ( arr != null ){
			System.out.println("-------Array:----------");
			for ( int i = 0; i < arr.length; i++ ) {
				System.out.println(i + ": " + arr[ i ]);
			}
			System.out.println("-----------------------");
		}
	}

	public static void main(String[] args) {
		
		int[] arr1 = {2, 5, 1, 0, 14, 3, 8, 11, 6, 4, 9, 13, 10, 7};
		
		print( arr1 );

		//arr1 = sort ( arr1 );
	}

}
