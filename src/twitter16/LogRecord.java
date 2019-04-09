package twitter16;

import java.util.*;

public class LogRecord {
	
	ArrayList<String> theLog;
	
	public LogRecord() {
		
		theLog = new ArrayList<String>();
		
	}
	
	public void record(String order_id) {
		theLog.add(order_id);
	}
	
	public String getOneLast(int num) {
		return theLog.get(theLog.size()-num);
	}
	
	public String[] getMoreLast(int num) {
		String[] list = new String[num];
		
		for(int x = 0 ; x < num; x++ ) {
			list[x] = theLog.get(theLog.size()-(1+x));
		}
		
		return list;
	}
	
	public int getLength() {
		return theLog.size();
	}

}













