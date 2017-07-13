package lsn8;

public class ArrDivOnMax {

	public static void divArray( int[] arrInt, int number, double[] arrDouble ){
		for ( int i = 0; i < arrInt.length; i++ ){
			arrDouble[ i ] = ( double )arrInt[ i ] / number;
		}
	}
}
