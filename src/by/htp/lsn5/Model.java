package by.htp.lsn5;
import java.util.Scanner;

public class Model {
		
	private Disc disc;
	private Scanner scInp = new Scanner( System.in );
	private View view;
	
	public void setView ( View view ) {
		this.view = view;
	}
	
	public void createDisc(){
		String inpLine = "";
		
		this.disc = new Disc();
		inpLine = inputUntilOk( "Enter the disc`s title:" );
		this.disc.setTitle( inpLine );
		System.out.println("Disc '" + this.disc.getTitle() + "' is created");
		System.out.println("and it is marked up for " + disc.getCompositions().length + " compositions...");
		System.out.println("Enter 'set count' to setup compositions` count.");
		System.out.println("Or enter 'composition' to add composition to disc.");
	}
	
	public void setCountOfCompositions() {
		int count = 0;
		
		if ( disc != null ){		
			count = inputIntUntilOk( "Enter a count of compositions for disc '" + this.disc.getTitle() + "':" );
			this.disc.setCompositions(count);
			System.out.println("Disc '" + disc.getTitle() + "' is marked up for " + disc.getCompositions().length + " compositions...");
			System.out.println("Enter 'composition' to add composition to disc.");
			
		} else {
			System.out.println("Error: Create the disc at first (enter 'new disc')...");
		}
	}
	
	public void addComposition(){
		String title = "";
		String style = "";
		int length = 0;
		
		title = inputUntilOk( "Enter the composition`s title:" );
		style = inputUntilOk( "Enter the composition`s style:" );
		length = inputIntUntilOk( "Enter the composition`s length (in sec.):" );
		
		if ( disc != null ) {
			disc.addComposition(title,  style,  length);
		}
		
		print();
	}
	
	public Disc getDisc(){
		return disc;
	}
	
	public void print() {
		if ( view != null ) {
			view.printDiscInfo(disc);
		}
	}
	
	private String inputUntilOk(String message) {
		String inpLine = "";
		String inpConfirm = "";
		
		do {
			System.out.println("-----------------------------------");
			System.out.println( message );
			inpLine = scInp.nextLine();
			System.out.println("-----------------------------------");
			System.out.println("You entered: '" + inpLine + "'. Enter 'Ok' to confirm or another string to cancel?");
			inpConfirm = scInp.nextLine();
		} while ( !inpConfirm.equalsIgnoreCase("ok") );
		
		return inpLine;
	}
	
	private int inputIntUntilOk(String message) {
		String inpConfirm="";
		String inpLine = "";
		int inpInt = 0;
		
		do {
			System.out.println("-----------------------------------");
			System.out.println( message );
			inpLine = scInp.nextLine();
			System.out.println("-----------------------------------");
			try {
				inpInt = Integer.parseInt( inpLine );
			}
			catch (Exception e){
				inpInt = 0;
			}
						
			System.out.println("You entered: '" + inpInt + "'. Enter 'Ok' to confirm or another string to cancel?");
			System.out.print("");
			inpConfirm = scInp.nextLine();
		} while ( !inpConfirm.equalsIgnoreCase("ok") );
		
		return inpInt;
	}
	
}
