package by.htp.lib;

public abstract class Edition {
	
	private String title;
	private String year;
	
	public static final String NONAME = "NONAME";
	public static final String UNKNOWN = "UNKNOWN";
	
	public Edition() {
		
	}

	public Edition(String title, String year) {
		super();
		if ( (title == null) || (title.trim().length() < 1) ) {
			title = NONAME;
		}
		this.title = title;
		if ( (year == null) || (year.trim().length() < 1) ) {
			year = UNKNOWN;
		}
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if ( (title == null) || (title.trim().length() < 1) ) {
			title = NONAME;
		}
		this.title = title;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		if ( (year == null) || (year.trim().length() < 1 ) ) {
			year = UNKNOWN;
		}
		this.year = year;
	}

	@Override
	public String toString() {
		return "Title: " + title + ", year of publication: " + year;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((year == null) ? 0 : year.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Edition other = (Edition) obj;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equalsIgnoreCase(other.title))
			return false;
		if (year == null) {
			if (other.year != null)
				return false;
		} else if (!year.equalsIgnoreCase(other.year))
			return false;
		return true;
	}
}
