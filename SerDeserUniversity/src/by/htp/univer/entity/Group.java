package by.htp.univer.entity;

import java.io.Serializable;

public class Group implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4051919304146617745L;
	private int groupNumber;

	public Group() {
		System.out.println("Group without parameters");
	}

	public Group(int groupNumber) {
		super();
		this.groupNumber = groupNumber;
		System.out.println("Group with params");
	}

	public int getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}

	@Override
	public String toString() {
		return "Group [groupNumber=" + groupNumber + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + groupNumber;
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
		Group other = (Group) obj;
		if (groupNumber != other.groupNumber)
			return false;
		return true;
	}
	
	
	
}
