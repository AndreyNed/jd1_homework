package by.htp.lsn5;

public class Composition {
	
	private String title;
	private String style;
	private int length;
	private int position;
	
	public Composition() {
		this.title = "";
		this.length = 0;
		this.style = "";
		this.position = -1;
	}

	public Composition(String title, int length, String style) {
		this.title = title;
		this.length = length;
		this.style = style;
		this.position = -1;		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}
	
	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public String lengthToString(){
		String strLength = "";
		int h = 0;
		int m = 0;
		int s = 0;
		
		s = this.length % 60;
		m = (this.length -s ) / 60;
		h = m / 60;
		m -= h * 60;
		
		strLength = h + " hours, " + m + " minutes, " + s + " seconds";		
		return strLength;
	}
	
	public int hmsToSeconds ( int hours, int minutes, int seconds ) {
		int secValue = 0;
		secValue = seconds + minutes * 60 + hours * 3600;
		
		return secValue;
	}
	
	public String infoStr (){
		String info = "";
		 if ( this.position > -1 ) {
			 info += this.position + ": ";
		 }
		info += "title: '" + this.title + "'; style: " + this.style + "; length: " + Main.intLengthToString( this.length );
		return info;
	}

}
