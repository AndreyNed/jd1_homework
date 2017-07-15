package prj1;

import java.util.Scanner;

public class UntilStop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scLine = new Scanner( System.in );
		String inpLine = "";
		int lineNumber = 0;
		
		System.out.println("Just make input lines until 'stop':");
		do {
			lineNumber++;
			System.out.print(lineNumber + ": ");
			inpLine = scLine.nextLine();
		}while ( !"stop".equals( inpLine ) );
		
		System.out.println("Stop input");
		scLine.close();
	}

}
