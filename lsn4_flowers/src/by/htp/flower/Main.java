package by.htp.flower;

public class Main {
	
	public static void printFlower( Flower flower ){
		System.out.println("---------------------------------------");
		System.out.println("Title: " + flower.getTitle());
		System.out.println("        height: " + flower.getHeight());
		System.out.println("        bud:");
		System.out.println("            color: " + flower.getBud().getColor());
		System.out.println("            size: " + flower.getBud().getSize());
		System.out.println("            petals:");
		for ( int i = 0; i < flower.getBud().getPetals().length; i++ ){
			System.out.println("                   " + i + ": color: " + flower.getBud().getPetals()[i].getColor());
			System.out.println("                      shape: " + flower.getBud().getPetals()[i].getShape());
		}
		System.out.println("---------------------------------------");
	}
	
	public static Petal[] fillInPetals ( Petal[] petals, String shape, String color ){
		for ( int i = 0; i < petals.length; i++ ){
			petals[ i ] = new Petal ( shape, color );
		}
		return petals;
	}
	
	

	public static void main(String[] args) {
		Petal[] petals1 = new Petal[5];
		
		petals1 = fillInPetals( petals1, "round", "blue" );
		
		Petal[] petals2 = new Petal[7];
		petals2 = fillInPetals( petals2, "oval", "red" );
		
		Bud bud1 = new Bud( 50, "blue", petals1 );
		Bud bud2 = new Bud( 60, "red", petals2 );
		
		Flower flower1 = new Flower( "Tulip", bud1, 55 );
		Flower flower2 = new Flower( "Rose", bud2, 90 );
		
		Flower flower3 = new Flower( "Camomile", 25 );
		flower3.toBloom();
		
		
		printFlower(flower1);
		printFlower(flower2);
	}

}
