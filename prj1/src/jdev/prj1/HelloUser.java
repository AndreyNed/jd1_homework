package prj1;

import java.util.Scanner;

public class HelloUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scLine = new Scanner( System.in );
		String userName = "";
		
		System.out.println("Enter your name:");
		userName = scLine.nextLine();
		
		System.out.println("Hello, " + userName + "!");
		
	}

}
