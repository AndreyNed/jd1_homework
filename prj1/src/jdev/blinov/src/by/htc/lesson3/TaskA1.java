package by.htc.lesson3;

import java.util.Scanner;

public class TaskA1 {

	public static void main(String[] args) {
		Scanner scLine = new Scanner( System.in );
		String userName = "";
		
		System.out.println("Enter your name:");
		userName = scLine.nextLine();
		
		System.out.println("Hello, " + userName + "!");
		scLine.close();
	}

}
