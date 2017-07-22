package by.htp.blinov_p126_5b;
import java.util.Scanner;

public class Controller {

	private Model model;

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}
	
	public void startInput() {
		Scanner scLine = new Scanner( System.in );
		String command = "";
		
		while ( !command.equalsIgnoreCase("exit") ) {
			System.out.println("Enter your command ('help' - to display all commands` info):");
			command = scLine.nextLine();
			command = command.toLowerCase();
			switch ( command ) {
				case "print":
					if ( model != null ) {
						model.toConsole();
					}
					break;
				case "help":
					if ( model != null ) {
						model.helpToConsole();
					}
					break;
				case "exit":
					System.out.println("See you later!");
					break;
			}
		}
		scLine.close();
	}
	
}
