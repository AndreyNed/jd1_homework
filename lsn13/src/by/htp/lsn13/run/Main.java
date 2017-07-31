package by.htp.lsn13.run;

import by.htp.lsn13.console.Console;
import by.htp.lsn13.Chapter7Task1A;

public class Main {

	public static void main(String[] args) {
		/* Таск 1А. Пустая строка задаст текст по умолчанию*/
		String s = Console.inputText( "Enter the text: " );
		System.out.println( s );		
		s = Chapter7Task1A.replaceEachAtPos( s , 'г', 5);
		System.out.println( s );
		
		
	}

}
