package com.orderHandle;

import java.util.Date;

public class TimeHandle {
	public int timedays(Date checkInTime, Date checkOutTime){
		long diff = checkOutTime.getTime() - checkInTime.getTime();//这样得到的差值是毫秒级别  
	    long days = diff / (1000 * 60 * 60 * 24);  
	    long hours = (diff-days*(1000 * 60 * 60 * 24))/(1000* 60 * 60);  
	    if(hours > 0) {
	    	return (int)days+1;
	    }
	    else{
	    	return (int)days;
	    }
	}
	/*public static void main(String[] args) {
		TimeHandle t = new TimeHandle();
		String s1 = "2020-01-09 00:19:13.128";
		Timestamp t1 = (Timestamp)s1;
		t.timedays("2020-01-09 00:19:13.128", "2020-01-09 00:19:13");
	}*/
}
