package by.htp.payment.domain.vo;

import java.io.Serializable;
import java.util.Arrays;

import by.htp.payment.domain.entity.Account;

public class PaymentSystem implements Serializable {

	private static final long serialVersionUID = 6313985458557504018L;

	private String title;
	
	private Account[] accounts;

	public PaymentSystem() {
		super();

	}

	public PaymentSystem(String title, Account[] accounts) {
		super();
		this.title = title;
		this.accounts = accounts;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Account[] getAccounts() {
		return accounts;
	}

	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(accounts);
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		PaymentSystem other = (PaymentSystem) obj;
		if (!Arrays.equals(accounts, other.accounts))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PaymentSystem: " + title + "; accounts: " + Arrays.toString(accounts);
	}

}
