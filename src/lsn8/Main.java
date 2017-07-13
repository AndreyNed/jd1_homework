package lsn8;
import java.util.Scanner;



public class Main {
	
	public static int getIndexX(){
		Scanner scInt = new Scanner( System.in );
		int x = scInt.nextInt();
		scInt.close();
		return x;
	}
	
	public static int[] getIndexYY ( int[][] arr ){
		Scanner scInt = new Scanner( System.in );
		int[] index = new int[ 2 ];
		
		for ( int i = 0; i < 2; i++ ){
			do {
				System.out.println("Введите индекс " + i + ": ");
				index[ i ] = scInt.nextInt();
			} while ( index[ i ] >= arr.length );
		}
		scInt.close();
		return index;
	}
	
	public static int[] randomArray( int[] arr ){
		double n;
		int[] fArr = new int[ arr.length ];
		for ( int i = 0; i < fArr.length; i++ ){
			n = Math.random( ) * 100;
			fArr[ i ] = (int) Math.round( n );
		}
		return fArr;
	}
	
	public static int[][] randomArray ( int countX, int countY ){
		double n;
		int[][] fArr = new int[ 1 ][ 1 ];
		
		if ( ( countX > 0 ) && ( countY > 0 ) ){
			fArr = new int[ countY ][ countX ];
			for ( int j = 0; j < countY; j++ ){
				for ( int i = 0; i < countX; i++ ){
					n = Math.random() * 100;
					fArr[ j ][ i ] = (int)Math.round( n );
				}
			}
		}
		return fArr;
	}
	
	public static void printArr( int[] arr ){
		System.out.println("--------------------------------------");
		for ( int i = 0; i < arr.length; i++ ) {
			System.out.print( i + ": " + arr[ i ] + "; " );
		}
		System.out.println();
		System.out.println("--------------------------------------");
	}
	
	public static void printArr( double[] arr ) {
		System.out.println("--------------------------------------");
		for ( int i = 0; i < arr.length; i++ ) {
			System.out.print( i + ": " + arr[ i ] + "; " );
		}
		System.out.println();
		System.out.println("--------------------------------------");
	}
	
	public static void printArr ( int[][] arr ){
		System.out.println("--------------------------------------");
		for ( int j = 0; j < arr.length; j++ ){
			System.out.print(j + ": ");
			for ( int i = 0; i < arr[ j ].length; i++ ){
				System.out.print( i + ": " + arr[ j ][ i ] + "; " );
			}
			System.out.println();
		}
		System.out.println("--------------------------------------");
	}

	public static void main(String[] args) {
		int maxIndex;
		int minIndex;
		int number;
		int count;
		int[] arr1;
		double[] arr2;
		int[][] arr3;
		int[] indexYY;
		
		/*Task 1*/
		System.out.println("Task 1:");
		arr1 = new int[ 20 ];
		arr1 = randomArray( arr1 );
		printArr( arr1 );
		maxIndex = MinMaxExchange.getMaxIndex( arr1 );
		System.out.println("Max value: [ " + maxIndex + " ] = " + arr1[ maxIndex ]);
		minIndex = MinMaxExchange.getMinIndex( arr1 );
		System.out.println("Min value: [ " + minIndex + " ] = " + arr1[ minIndex ]);
		MinMaxExchange.exchangeItems(arr1, maxIndex, minIndex);
		System.out.println("New array:");
		printArr( arr1 );
		/*Task 1 - END*/
		
		System.out.println();
		
		/*Task 2*/
		System.out.println("Task 2:");
		arr1 = new int[ 20 ];
		arr1 = randomArray( arr1 );
		arr2 = new double[ 20 ];
		System.out.println("Array initial: ");
		printArr( arr1 );
		maxIndex = MinMaxExchange.getMaxIndex( arr1 );
		System.out.println( "Max index: " + maxIndex );
		ArrDivOnMax.divArray(arr1, maxIndex, arr2);
		System.out.println("Array final:");
		printArr( arr2 );
		/*Task 2 - END*/
		
		System.out.println();
		
		/*Task 3*/
		System.out.println("Task 3:");
		arr1 = new int[ 20 ];
		arr1 = randomArray( arr1 );
		System.out.println("Initial array: ");
		printArr( arr1 );
		System.out.println("Changed array: ");
		PosNeg.makePosNeg(arr1);
		printArr( arr1 );
		System.out.println("New array from positive numbers with even indexes: ");
		arr1 = PosNeg.makeEvenPosArray(arr1);
		printArr( arr1 );
		System.out.println("Sum of squares of array`s items: " + PosNeg.sumSquares( arr1 ) );
		/*Task 3 - END*/
		
		System.out.println();
		
		/*Task 4*/
		System.out.println("Task 4:");
		arr3 = randomArray( 10, 10 );
		printArr( arr3 );
		indexYY = getIndexYY( arr3 );
		System.out.println("Y1 = " + indexYY[ 0 ]);
		System.out.println("Y2 = " + indexYY[ 1 ]);
		System.out.println("New array: ");
		ChangeLine.changeLines(arr3, indexYY[ 0 ], indexYY[ 1 ]);
		printArr( arr3 );
		/*Task 4 - END*/
		
		System.out.println();
		
		/*Task 5*/
		System.out.println("Task 5:");
		arr3 = randomArray( 15, 15 );
		arr1 = new int[ 15 ];
		System.out.println("Initial array:");
		printArr( arr3 );
		System.out.println("Array of max values per column:");
		arr1 = MaxValues.maxValuesArray(arr3);
		printArr( arr1 );
		/*Task 5 - END*/
		
		System.out.println();
		
		/*Task 6*/
		System.out.println("Task 6:");
		arr3 = randomArray( 15, 15 );
		System.out.println("Initial array: ");
		printArr( arr3 );
		System.out.println("Enter the number:");
		number = getIndexX();
		count = NumCount.getCount(arr3,  number);
		System.out.println("The number " + number + " was met: " + count + " times.");
		/*Task 6 - END*/
		
	}

}
