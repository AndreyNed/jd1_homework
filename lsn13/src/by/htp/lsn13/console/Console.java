package by.htp.lsn13.console;

import java.util.Scanner;

public class Console {

	private static Scanner sc;
	
	public static String inputText() {
		sc = new Scanner( System.in );
		return sc.nextLine();
	}
	
}
