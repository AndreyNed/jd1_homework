package by.htp.lib;

public class Magazine extends Edition {
	
	private int issue;

	public Magazine(String title, String year, int issue) {
		super(title, year);
		this.issue = issue;
	}

	public int getIssue() {
		return issue;
	}

	@Override
	public String toString() {
		return "Magazine: " + this.getTitle() + ", year: " + this.getYear() + ", issue: " + issue;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + issue;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Magazine other = (Magazine) obj;
		if (issue != other.issue)
			return false;
		return true;
	}
	
}
