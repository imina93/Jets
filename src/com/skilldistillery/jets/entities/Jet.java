package com.skilldistillery.jets.entities;

public abstract class Jet {
	private String model;
	private double speedInMph;
	private int range;
	private long price;
	
	// no arg constructor
	public Jet() {
		super();
	}

	// 4 arg constructor
	public Jet(String model, double speedInMph, int range, long price) {
		super();
		this.model = model;
		this.speedInMph = speedInMph;
		this.range = range;
		this.price = price;
	}
	// Calculate maximum flight time and print all info
	public void fly() {
		double maxFlightTime = (this.range / this.speedInMph);
		System.out.println("Model: " + this.model + " Speed in mph: " + this.speedInMph + " Range in miles: " + this.range 
				+ "Price: $" + this.price + "Maximum Flight Time: " + maxFlightTime);
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public double getSpeedInMph() {
		return speedInMph;
	}


	public void setSpeedInMph(double speedInMph) {
		this.speedInMph = speedInMph;
	}


	public double getRange() {
		return range;
	}


	public void setRange(int range) {
		this.range = range;
	}


	public long getPrice() {
		return price;
	}


	public void setPrice(long price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Jet [model=" + model + ", speedInMph=" + speedInMph + ", range=" + range + ", price=" + price + "]";
	}
	


}

