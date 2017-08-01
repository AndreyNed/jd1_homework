package by.htp.lsn13.run;

import by.htp.lsn13.console.Console;
import by.htp.lsn13.Chapter7Task1A;
import by.htp.lsn13.Chapter7Task2A;

public class Main {

	public static void main(String[] args) {
		/* Таск 1А. Пустая строка задаст текст по умолчанию*/
		String s = Console.inputText( "Enter the text: " );
		System.out.println( s );		
		s = Chapter7Task1A.replaceEachAtPos( s , 'г', 4);
		System.out.println( s );
		System.out.println();
		
		s = Console.inputText("Enter the text: ");
		System.out.println( s );
		System.out.println( Chapter7Task2A.splitString( s ) );
		Console.printStrToInt( s );
	}
}
