/**contains a Fibonacci`s value and a sign if it is even*/
package prj1;

public class Item {
	private long value = 0;
	private boolean is_even = false;

	public long get_value() {
		return this.value;
	}

	public void set_value(long value) {
		this.value = value;
		this.is_even = (this.value % 2 == 0);
	}

	public boolean get_is_even() {
		return this.is_even;
	}
}
