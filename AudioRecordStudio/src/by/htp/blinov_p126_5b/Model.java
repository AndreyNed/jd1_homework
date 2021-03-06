package by.htp.blinov_p126_5b;

public class Model {
	
	private Disc disc;
	
	private ViewConsole view;
	
	private void defaultInit(){
		Song song1 = new Song( "Smoke on the water", "Deep purple", "Rock", 485 );
		Song song2 = new Song( "What a wonderful world", "Louis Armstrong", "Blues", 315 );
		Song song3 = new Song( "I put a spell on you", "Nina Simon", "Blues", 408 );
		Song song4 = new Song( "Soldier of fortune", "Deep purple", "Rock", 628 );
		Song song5 = new Song( "Wild world", "Mr. Big", "Rock", 209 );
		Song song6 = new Song( "Layla", "Eric Clapton", "Blues", 305 );
		Song[] songs = { song1, song2, song3, song4, song5, song6 };
		disc = new Disc( "The best" );
		for ( int i = 0; i < songs.length; i++ ){
			disc.addRecord( songs[ i ] );
		}
	}
	
	public Model() {
		super();
		defaultInit();
	}


	public ViewConsole getView() {
		return view;
	}

	public void setView(ViewConsole view) {
		this.view = view;
	}

	public Disc getDisc() {
		return disc;
	}

	public void setDisc(Disc disc) {
		this.disc = disc;
	}
	
	public void toConsole() {
		view.showDiscInfo();
	}
	
	public void helpToConsole() {
		view.showHelp();
	}
	
}
