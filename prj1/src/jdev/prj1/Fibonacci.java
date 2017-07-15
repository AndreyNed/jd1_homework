package prj1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Output Fibonacci`s numbers < 50*/
		final int MAX = 50;
		final int MIN = 1;
		long lNumber = 0;
		long hNumber = 1;
		char even = ' ';
		System.out.println("Fibonacci`s numbers (from " + MIN + " to " + (MAX - 1) + "):");
		//System.out.println("1: " + MIN);
		for ( int i = 1; i < 50; i++ ) {
			hNumber+= lNumber;
			lNumber = hNumber - lNumber;
			if ( lNumber % 2 == 0 ) {
				even = '*';
			} else {
				even = ' ';
			}
			System.out.println( i + ": " + lNumber + even);
		}
	}

}
