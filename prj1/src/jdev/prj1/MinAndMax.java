package prj1;

public class MinAndMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] myNumbers = new double[ 3 ];
		double min = 0;
		double max = 0;
		
		for ( int i = 0; i < myNumbers.length; i++ ) {
			myNumbers[ i ] = Math.round( Math.random() * 100);
		}
		
		min = myNumbers[ 0 ];
		max = myNumbers[ 0 ];
		
		for ( int i = 0; i < myNumbers.length; i++ ) {
			if ( min > myNumbers[ i ] ) {
				min = myNumbers[ i ];
			} else if ( max < myNumbers[ i ] ) {
				max = myNumbers[ i ];
			}
		}
		
		System.out.println("The array is:");
		for ( int i = 0; i < myNumbers.length; i++ ) {
			System.out.print(i + ": " + myNumbers[ i ] + "; ");
		}
		System.out.println("-----------------------");
		
		System.out.println("MAX value is: " + max + "; MIN value is:" + min);
		
	}

}
