/**creates sequence of Fibonacci and outputs it to console line-by-line like No: Value[* - if it is even] */
package prj1;

public class FibonacciClass {

	private static Item[] items_init(Item[] items) {
		for (int i = 0; i < items.length; i++) {
			items[i] = new Item();
		}
		return items;
	}

	private static Item[] make_fibonacci(Item[] items) {
		items[0].set_value(1);
		items[1].set_value(1);
		for (int i = 2; i < items.length; i++) {
			items[i].set_value(items[i - 2].get_value() + items[i - 1].get_value());
		}
		return items;
	}

	private static void items_to_console(Item[] items) {
		for (int i = 0; i < items.length; i++) {
			System.out.println(i + ": " + items[i].get_value() + ((items[i].get_is_even() ? "*" : "")) + ";");
		}
	}

	public static void main(String[] args) {
		final int MAX_INDEX = 50;
		Item[] items = new Item[MAX_INDEX];

		items = items_init(items);
		items = make_fibonacci(items);
		items_to_console(items);
	}

}
