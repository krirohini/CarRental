package com.rohini.rental;

public class Rentalcount {
	
	private int lastweek;
	private int yeartodate;
	
	public int getLastWeek() {
		return lastweek;
	}
	public void setLastWeek(int lastweek) {
		this.lastweek = lastweek;
	}
	public int getYearToDate() {
		return yeartodate;
	}
	public void setYearToDate(int yeartodate) {
		this.yeartodate = yeartodate;
	}
	
	@Override
	public String toString() {
		return "Rentalcount [lastWeek=" + lastweek + ", yearToDate=" + yeartodate + "]";
	}
	
	
	

}
