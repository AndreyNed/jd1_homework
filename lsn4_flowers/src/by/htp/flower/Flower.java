package by.htp.flower;

public class Flower {
	
	private float height;
	private String title;
	private Bud bud;
	
	public Flower( String title, Bud bud, float height ) {
		this.title = title;
		this.bud = bud;
		this.height = height;
	}
	
	public Flower( String title, float height ) {
		this.title = title;
		this.height = height;
	}	
	
	public String getTitle(){
		return this.title;
	}
	
	public Bud getBud(){
		return this.bud;
	}
	
	public float getHeight(){
		return this.height;
	}
	
	public void toBloom(){
		if ( this.bud==null ){
			this.bud = new Bud(15, "red", 3);
			for (int i=0; i<this.bud.getPetals().length;i++){
				//addPetal();
			}
		} else {
			double oldSize = this.bud.getSize();
			double newSize = this.bud.setSize(oldSize * 2);
			
		}
	}

	public String[] flowerInfo(){
		String[] budInfo = new String [this.bud.getInfo().length];
		String[] info = new String[budInfo.length + 3];
		info[0]="Title: " + this.title;
		info[1]="Height: " + this.height;
		for (int i = 2; i < info.length; i++){
			info[i] = budInfo[i-2];
		}
		return info;
	}
	
}
