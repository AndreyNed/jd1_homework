package by.htp.flower;

public class Petal {
	
	private String shape;
	private String color; 
	
	public Petal (String shape, String color){
		//System.out.println("Petal created");
		this.shape = shape;
		this.color = color;
	}
	
	public String getShape (){
		return this.shape;
	}
	
	public String getColor(){
		return this.color;
	}
	
	public String getInfo(){
		return "shape: " + this.shape + "; color: " + this.color;
	}
}
