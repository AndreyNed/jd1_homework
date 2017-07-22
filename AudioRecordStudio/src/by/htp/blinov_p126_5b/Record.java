package by.htp.blinov_p126_5b;

public class Record extends Song{

	private String discTitle;
	
	public Record(Song song, String discTitle) {
		super(song.getTitle(), song.getArtist(), song.getGenre(), song.getTimeLength());
		this.discTitle = discTitle;
	}

	public String getDiscTitle() {
		return discTitle;
	}

	public void setDiscTitle(String discTitle) {
		this.discTitle = discTitle;
	}

}
