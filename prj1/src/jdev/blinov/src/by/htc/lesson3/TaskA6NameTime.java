package by.htc.lesson3;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TaskA6NameTime {

	public static void main(String[] args) {
		Scanner scLine = new Scanner(System.in);
		Date dateStart = new Date();
		Date dateFinish;
		SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
		//String startDateTime = dateStart.toString();
		//String endDateTime = "";
		String devName = "";
		
		System.out.println("Enter your name:");
		devName = scLine.nextLine();
		dateFinish = new Date();
		System.out.println("----------------------------------");
		System.out.println("Developer: " + devName);
		System.out.println("Task was received: " + format1.format(dateStart));
		System.out.println("Task has been finished: " + format1.format(dateFinish));
		System.out.println("----------------------------------");
		scLine.close();
	}

}
