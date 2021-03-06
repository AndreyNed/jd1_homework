package by.htp.blinov_p126_5b;

public class Song {
	
	private String title;
	private String artist;
	private String genre;
	private int timeLength;
	
	public Song(String title, String artist, String genre, int timeLength) {
		super();
		this.title = title;
		this.artist = artist;
		this.genre = genre;
		this.timeLength = timeLength;
	}

	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	public String getGenre() {
		return genre;
	}

	public int getTimeLength() {
		return timeLength;
	}
	
	public String toString(){
		String info = title + " - " + artist + " - " + DoThis.timeSecToString(timeLength) + " - " + genre;
		return info;
	}

}
