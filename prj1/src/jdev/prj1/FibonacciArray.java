package prj1;

public class FibonacciArray {
	
	public static void print_items( long[] items ) {
		String even = "";
		System.out.println("------------------");
		for ( int i = 0; i < items.length; i++ ) {
			if ( items[ i ] % 2 == 0 ) {
				even = "*";
			} else {
				even = "";
			}
			System.out.println( ( i + 1 ) + ": " + items[ i ] + even + ";" );
		}
		System.out.println("------------------");
	}

	public static void main(String[] args) {
		final int ROW_LENGTH = 50;
		long[] items = new long [ ROW_LENGTH ];
		
		items[ 0 ] = 1;
		items[ 1 ] = 1;
		
		for (int i = 2; i < items.length; i++) {
			items[ i ] = items[ i - 2 ] + items[ i - 1 ];
			//items[ i - 1 ] = items[ i ] - items[ i - 1 ];
		}
		print_items( items );
	}

}
