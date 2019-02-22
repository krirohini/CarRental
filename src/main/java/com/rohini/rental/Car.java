package com.rohini.rental;

import java.util.HashMap;

import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement
public class Car {
	
	private String make;
	private String model;
	private String vin;
	private Metadata metadata;
	private Perdayrent perdayrent;
	private Metrics metrics;

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public Metadata getMetaData() {
		return metadata;
	}

	public void setMetaData(Metadata metadata) {
		this.metadata = metadata;
	}

	public Perdayrent getPerDayRent() {
		return perdayrent;
	}

	public void setPerDayRent(Perdayrent perdayrent) {
		this.perdayrent = perdayrent;
	}

	public Metrics getMetrics() {
		return metrics;
	}

	public void setMetrics(Metrics metrics) {
		this.metrics = metrics;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", vin=" + vin + ", metadata=" + metadata + ", perdayrent="
				+ perdayrent + ", metrics=" + metrics + "]";
	}
	
	

}
