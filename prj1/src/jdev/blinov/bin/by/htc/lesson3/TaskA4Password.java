package blinov.bin.by.htc.lesson3;

import java.util.Scanner;

public class TaskA4Password {

	static final String PASSWORD = "Parol";

	public static void main(String[] args) {
		Scanner scLine = new Scanner(System.in);
		String password = "";

		do {
			System.out.println("Enter your password:");
			password = scLine.nextLine();
			if (password.equals(PASSWORD)) {
				System.out.println("Password is correct. Access is granted.");
			} else {
				System.out.println("Password is wrong. Try again... ");
			}
		} while (!password.equals(PASSWORD));

		scLine.close();
	}

}
