package com.rohini.rental;

public class Perdayrent {
	
	private float price;
	private float discount;
	
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	
	@Override
	public String toString() {
		return "Perdayrent [price=" + price + ", discount=" + discount + "]";
	}
	
	
	

}
