package prj1;

public class SquareTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX = 20;
		final int MIN = 1;
		
		System.out.println("The table of squares:");
		for ( int i = MIN; i <= MAX; i++  ) {
			System.out.println(i + " x " + i + " = " + (i * i) + ";");
		}
	}

}
