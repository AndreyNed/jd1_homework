package by.htp.blinov_p126_5b;

public class Disc {
	
	private final int MAX_TIME_LENGTH = 4800; 
	
	private String title;
	private Record[] records;
	
	public Disc( String title ) {
		super();
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle( String title ) {
		this.title = title;
	}

	public Record[] getRecords() {
		return records;
	}

	public void setRecords( Record[] records ) {
		this.records = records;
	}

	public int getMAX_TIME_LENGTH() {
		return MAX_TIME_LENGTH;
	}
	
	public Boolean addRecord( Song song ) {
		Boolean result = false;
		int totalTime = calculateTotalTime();
		
		if ( ( MAX_TIME_LENGTH - totalTime ) >= song.getTimeLength() ) {
			Record newRecord = new Record( song, title );
			pushRecord( newRecord );
			result = true;
		}
		return result;
	}
	
	public int calculateTotalTime(){
		int totalTime = 0;
		
		if ( this.records != null ) {
			for ( int i = 0; i < records.length; i++ ) {
				if ( records[ i ] != null ) {
					totalTime += records[ i ].getTimeLength();
				}
			}
		}
		return totalTime;
	}
	
	private void pushRecord( Record record ) {
		if ( record != null ){
			if ( records == null ) {
				records = new Record[ 0 ];
			}
			Record[] newRecords = records;
			records = new Record[ newRecords.length + 1 ];
			for ( int i = 0; i < newRecords.length; i++ ) {
				records[ i ] = newRecords[ i ];
			}
			records[ records.length - 1 ] = record;
			record.setDiscTitle(title);
		}
	}
	
}
