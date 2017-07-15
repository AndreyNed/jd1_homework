package by.htp.lsn4tree;

public class Leaf {
	
	private String color = "green";
	private int size = 5;
	private Boolean frosty = false;
	
	public Leaf() {

	}

	public Leaf(String color) {
		super();
		this.color = color;
	}

	public Leaf(int size) {
		super();
		this.size = size;
	}

	public Leaf(Boolean frosty) {
		super();
		this.frosty = frosty;
	}

	public Leaf(String color, int size) {
		super();
		this.color = color;
		this.size = size;
	}

	public Leaf(String color, Boolean frosty) {
		super();
		this.color = color;
		this.frosty = frosty;
	}

	public Leaf(int size, Boolean frosty) {
		super();
		this.size = size;
		this.frosty = frosty;
	}
	
	
	
	public Leaf(String color, int size, Boolean frosty) {
		this.color = color;
		this.size = size;
		this.frosty = frosty;
	}

	public String getInfo(){
		String info = "color: " + this.color + "; size: " + this.size;
		if ( this.frosty ) {
			info += "; frosty";
		} else {
			info += "; not frosty";
		}
		
		return info;
	}
	
	
}
