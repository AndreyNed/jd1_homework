package by.htp.lsn4tree;

public class Main {
	
	public static void printInfo ( String[] info ){
		System.out.println("------------------------------------------------------------");
		for ( int i = 0; i < info.length; i++ ){
			System.out.println( info[ i ] );
		}
		System.out.println("------------------------------------------------------------");
	}

	public static void main(String[] args) {

		String[] info;
		
		Tree tree1 = new Tree( "Oak", 3 );
		
		info = tree1.getInfo();
		printInfo( info );
		
	}

}
