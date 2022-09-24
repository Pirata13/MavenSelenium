package com.trustid.utilities;

public class RedmineData {
	
	private String day;
	private String hours;
	private String comment;
	private String activity;
	
	
	public RedmineData(String day, String hours, String comment, String activity) {
		super();
		this.day = day;
		this.hours = hours;
		this.comment = comment;
		this.activity = activity;
	}
	
	public RedmineData(String data) {
		
		String[] redmineData = data.split(";"); 
		this.day = redmineData[0];
		this.hours = redmineData[1];
		this.comment = redmineData[2];
		this.activity = redmineData[3];
		
	}
	
	
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getHours() {
		return hours;
	}
	public void setHours(String hours) {
		this.hours = hours;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getActivity() {
		return activity;
	}
	public void setActivity(String activity) {
		this.activity = activity;
	}


	@Override
	public String toString() {
		return "RedmineData [day=" + day + ", hours=" + hours + ", comment=" + comment + ", activity=" + activity+"]";
	}

}
