package com.skilldistillery.jets.entities;

import java.util.Objects;

public abstract class Jet {
	private String model;
	private double speedInMph;
	private int range;
	private long price;
	
	// no arg constructor
	public Jet() {
		super();
	}



	@Override
	public int hashCode() {
		return Objects.hash(model, price, range, speedInMph);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jet other = (Jet) obj;
		return Objects.equals(model, other.model) && price == other.price && range == other.range
				&& Double.doubleToLongBits(speedInMph) == Double.doubleToLongBits(other.speedInMph);
	}



	// 4 arg constructor
	public Jet(String model, double speedInMph, int range, long price) {
		super();
		this.model = model;
		this.speedInMph = speedInMph;
		this.setRange(range);
		this.price = price;
	}
	// Calculate maximum flight time and print all info
	public void fly() {
		double maxFlightTime = (this.getRange() / this.speedInMph);
		System.out.println("Model: " + this.model + " Speed in mph: " + this.speedInMph + " Range in miles: " + this.getRange() 
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
		return "Jet model: " + model + ", Speed: " + speedInMph + "MPH , Range: " + getRange() + ", Price: $" + price;
	}
	


}

