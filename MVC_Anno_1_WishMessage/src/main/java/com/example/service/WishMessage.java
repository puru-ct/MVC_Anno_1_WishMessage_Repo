package com.example.service;

import java.util.Calendar;

public class WishMessage {
	public String wishMessageGenerator(){
		
		int hour=0;
		Calendar cal=null;
		cal=Calendar.getInstance();
		hour=cal.get(Calendar.HOUR_OF_DAY);
		
		if(hour>=12) {
			return "Good Morning";
		}else if(hour>=15) {
			return "Good Afternoon";
		}else if(hour>=18) {
			return "Good Evening";
		}else {
			return "Good Night";
		}
				
	}
}
