package com.skilldistillery.jets.entities;

public class JetImpl extends Jet {

	public JetImpl() {
		
	}

	public JetImpl(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	
	@Override
	public String toString() {
		return "Generic model: " + getModel() + ", speed(mph): " + getSpeedInMph() + ", range(miles): " + getRange()
				+ ", price($): " + getPrice();
	}
	
	

}