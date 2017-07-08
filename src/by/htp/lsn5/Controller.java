package by.htp.lsn5;
import java.util.Scanner;

public class Controller {
	
	private Scanner scInp = new Scanner( System.in );
	private Model model;
	
	public void setModel ( Model model ) {
		this.model = model;
	}
	
	public void startScan() {
		String inpLine="";
		
		do {
			System.out.println("Enter the command ('exit' for exit)");
			if ( model != null ) {
				if ( model.getDisc() == null ) {
					System.out.println("Create a new disc (enter 'new disc')");
				}
			}
			inpLine = scInp.nextLine();
			
			switch ( inpLine ) {
				case "print":
					if ( model != null ) {
						model.print();
					}
					break;
					
				case "new disc":
					if ( model != null ) {
						model.createDisc();
					}
					break;
					
				case "set count":
					if ( model != null ) {
						model.setCountOfCompositions();
					}
					break;
				
				case "composition":
					if ( model != null ) {
						model.addComposition();
					}
					break;
				default:
					
			}
			
		} while ( !inpLine.equalsIgnoreCase("exit") );
		
	}

}
