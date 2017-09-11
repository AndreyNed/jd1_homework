package by.htp.payment.domain.entity;

import java.io.Serializable;

public class Account implements Serializable {

	private static final long serialVersionUID = -2337275480367588690L;

	private String number;
	
	private int sum;

	public Account() {
		super();

	}

	public Account(String number, int sum) {
		super();
		this.number = number;
		this.sum = sum;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		result = prime * result + sum;
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
		Account other = (Account) obj;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		if (sum != other.sum)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Account: " + number + "; sum: " + sum;
	}
	
}
