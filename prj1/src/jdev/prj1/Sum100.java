package prj1;

public class Sum100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX_INDEX = 100;
		int sum = 0;
		for ( int i = 1; i <= MAX_INDEX; i++ ) {
			sum += i;
		}
		System.out.println("Sum from 0 till " + MAX_INDEX + " is equal to " + sum);
	}

}
