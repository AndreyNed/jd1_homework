package by.htp.blinov_p126_5b;

public class DoThis {

	public static String timeSecToString( int sec ) {
		int min = 0;
		int hour = 0;
		
		min = sec / 60;
		sec -= min * 60;
		hour = min / 60;
		min -= hour * 60;
		
		return ( hour + " : " + min + " : " + sec );
	}
	
}
