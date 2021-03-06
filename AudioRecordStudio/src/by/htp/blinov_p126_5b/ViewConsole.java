package by.htp.blinov_p126_5b;

public class ViewConsole {
	
	private Model model;
	
	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}
	
	public void showHelp() {
		System.out.println("-----------------------------------------------");
		System.out.println("help - show all commands");
		System.out.println("print - show disc`s info");
		System.out.println("exit - stop application");
		System.out.println("-----------------------------------------------");
	}

	public void showDiscInfo() {
		Disc disc = model.getDisc();
		if ( disc != null ) {
			System.out.println("-----------------------------------------------");
			System.out.println("Disc: " + disc.getTitle());
			for ( int i = 0; i < disc.getRecords().length; i++ ) {
				System.out.println("    " + ( i + 1 ) + ". " + disc.getRecords()[ i ].toString());
			}
			System.out.println();
			System.out.println("Total records: " + disc.getRecords().length + ". Total time of play: " + DoThis.timeSecToString( disc.calculateTotalTime() ) );
			System.out.println("-----------------------------------------------");
		}
	}

}
