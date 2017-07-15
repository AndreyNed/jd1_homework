package prj1;

import java.util.Scanner;

public class VersusArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX_INDEX = 4;
		Scanner scArg = new Scanner( System.in );
		String[] inpArgs = new String [ MAX_INDEX ];
		
		System.out.println("Enter arguments (0..3):");
		int i = 0;
		do {
			System.out.println(i + ": ");
			inpArgs[ i ] = scArg.nextLine();
			i++;
		}while ( i < inpArgs.length );
		
		System.out.println("-------------------------");
		for ( i = (inpArgs.length - 1); i >= 0; i-- ){
			System.out.println(i + ": " + inpArgs[ i ]);
		}
		System.out.println("-------------------------");
		scArg.close();
	}

}
