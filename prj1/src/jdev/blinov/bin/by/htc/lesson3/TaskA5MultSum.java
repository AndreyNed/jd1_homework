package blinov.bin.by.htc.lesson3;
import java.util.Scanner;

public class TaskA5MultSum {

	public static void main(String[] args) {
		final int MAX_INDEX = 3;
		int i = 0;
		int[] numbers = new int[MAX_INDEX];
		int sum = 0;
		int mult = 1;
		Scanner scInt = new Scanner(System.in);
		System.out.println("Enter " + MAX_INDEX + " number(s):");
		do{
			System.out.println((i+1) + ": ");
			numbers[i] = scInt.nextInt();
			sum += numbers[i];
			mult *= numbers[i];
			i++;
		} while ( i < MAX_INDEX );
		System.out.println("");
		System.out.println("---------------------");
		System.out.println("Your have entered: ");
		for ( i = 0; i < numbers.length; i++ ){
			System.out.print(i+": "+numbers[i]);
			if (i<(numbers.length-1)){
				System.out.print("; ");
			} else {
				System.out.println("");
			}
		}
		System.out.println("---------------------");
		System.out.println("Sum is equals: " + sum);
		System.out.println("Mult is equals: " + mult);
		System.out.println("---------------------");
		scInt.close();
	}

}
