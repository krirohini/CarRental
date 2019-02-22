package com.rohini.rental;

public class Metrics {
	
	private float yoymaintenancecost;
	private float depreciation;
	private Rentalcount rentalcount;
	
	public float getYoyMaintenanceCost() {
		return yoymaintenancecost;
	}
	public void setYoyMaintenanceCost(float yoymaintenancecost) {
		this.yoymaintenancecost = yoymaintenancecost;
	}
	public float getDepreciation() {
		return depreciation;
	}
	public void setDepreciation(float depreciation) {
		this.depreciation = depreciation;
	}
	public Rentalcount getRentalCount() {
		return rentalcount;
	}
	public void setRentalCount(Rentalcount rentalcount) {
		this.rentalcount = rentalcount;
	}
	
	@Override
	public String toString() {
		return "Metrics [yoymaintenancecost=" + yoymaintenancecost + ", depreciation=" + depreciation
				+ ", rentalcount=" + rentalcount + "]";
	}

	
	
}
