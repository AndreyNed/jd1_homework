package by.htp.flower;

public class Bud {
	
	private double size;
	private String color;
	private Petal[] petals;
	private int lastPetalIndex = 0;
	
	public Bud ( double size, String color, Petal[] petals ) {
		this.size = size;
		this.color = color;
		this.petals = petals;
		this.lastPetalIndex = -1;
	}
	
	public Bud ( double size, String color, int petalCount ){
		this.size = size;
		this.color = color;
		if ( petalCount > 0 ){
			this.petals = new Petal[ petalCount ];
		}
	}
	
	public Bud() {

		// TODO Auto-generated constructor stub
	}

	public String getColor(){
		return this.color;
	}
	
	public double getSize(){
		return this.size;
	}
	
	public double setSize(double size){
		this.size = size;
		return this.size;
	}
	
	public Petal[] getPetals (){
		return this.petals;
	}
	
	public String[] getInfo(){
		String[] info = new String [ this.petals.length + 3 ];
		info[ 0 ] = "color: " + this.color;
		info[ 1 ] = "size: " + this.size;
		info[ 2 ] = "Petals: ";
		for ( int i = 0; i < this.petals.length; i++ ) {
			info[ i + 2 ] = this.petals[ i ].getInfo();
		}
		return info;
	}
	
	public void addPetal( Petal petal ){
		if ( petal != null ) {
			if ( lastPetalIndex < (this.petals.length - 1) ){
				this.petals[lastPetalIndex] = petal;
			}
			
		}
	}

}
