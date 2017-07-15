package by.htp.lsn4tree;

public class Tree {

	private String title;
	private Branch[] branches;
	private Boolean frosty;
	private int lastBranchIndex;
	
	
	public Tree() {
		this.title = "";
		this.frosty = false;
		this.branches = null;
		this.lastBranchIndex = -1;
	}



	public Tree(Branch[] branches) {
		this.title = "";
		this.branches = branches;
		this.lastBranchIndex = 0;
		this.frosty = false;
	}
	
	public Tree( String title, int branchesCount ) {
		this.title = title;
		if ( branchesCount > 0 ) {
			addBranches( branchesCount );
		}
		this.frosty = false;
	}
	
	public void addBranches( int branchesCount ){
		if ( this.branches == null ) {
			this.branches = new Branch[ branchesCount ];
			this.lastBranchIndex = -1;
		}
		
		int restCount = ( this.branches.length - 1 ) - this.lastBranchIndex;
		
		if ( branchesCount > restCount ){
			branchesCount = restCount;
		}
		
		int lastIndexAdd = this.lastBranchIndex + branchesCount;
		
		for ( int i = ( this.lastBranchIndex + 1 ); i <= lastIndexAdd; i++ ){
			this.lastBranchIndex = i;
			this.branches[ i ] = new Branch( 4 );
		}
	}
	
	public String[] getInfo(){
		String[] info;
		int stringCount = 0;
		
		for ( int i = 0; i < this.branches.length; i++ ) {
			stringCount += this.branches[ i ].getInfo().length;
		}
		
		info = new String[ stringCount + 1 ];
		
		info[ 0 ] = "Title: " + this.title + "; Branches` count: " + this.branches.length;
		if ( this.frosty ) {
			info[ 0 ] += "; frosty";
		} else {
			info[ 0 ] += "; not frosty";
		}
		
		int currentIndex = 1;
		
		for ( int i = 0; i < this.branches.length; i++ ){
			String[] infoPart = this.branches[ i ].getInfo();
			info[ currentIndex ] = "Branch " + currentIndex + ": ";
			for ( int j = 0; j < infoPart.length; j++ ){
				if ( info[ currentIndex ] != null ) {
					info[ currentIndex ] += infoPart[ j ];
				} else {
					info[ currentIndex ] = infoPart[ j ];
				}
				currentIndex++;
			}
		}
		
		return info;
	}
	
}
