package by.htp.lsn4tree;

public class Branch {

	private Leaf[] leves;
	private int length;
	private Boolean frosty;
	private int leafLastIndex;
	
	public Branch() {
		this.leves = null;
		this.frosty = false;
		this.length = 10;
		this.leafLastIndex = -1;
	}

	public Branch(int leafCount) {
		this.leves = new Leaf[ leafCount ];
		this.length = leafCount / 2;
		this.frosty = false;
		this.leafLastIndex = -1;
		addLeafs( leafCount );
	}
	
	public void addLeafs( int leafCount ) {
		if ( this.leves == null ) {
			if ( leafCount > 0 ) {
				this.leves = new Leaf[ leafCount ];
			}
		} else {
			int restCount = this.leves.length - (this.leafLastIndex + 1);
			if ( leafCount > restCount ){
				leafCount = restCount;
			}
			for ( int i = 0; i < leafCount; i++ ){
				this.leafLastIndex = i;
				this.leves[ this.leafLastIndex ] = new Leaf();
			}
		}
	}

	public String[] getInfo(){
		String[] info = new String [ this.leves.length + 1 ];
		info[ 0 ] = "Length: " + this.length;
		if ( this.frosty ) {
			info[ 0 ] += "; frosty";
		} else {
			info[ 0 ] += "; not frosty";
		}
		info[ 0 ] += "; leves` count: " + this.leves.length;
		for ( int i = 1; i < info.length; i++ ){
			info[ i ] = "Leaf " + i + ": " + this.leves[ i - 1 ].getInfo();
		}
		return info;
	}
	
	
	
	

}
