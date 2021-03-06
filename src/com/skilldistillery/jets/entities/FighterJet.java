package com.skilldistillery.jets.entities;

public class FighterJet extends Jet implements CombatReady{

	public FighterJet() {
		super();
	}
	
	public FighterJet(String model, double speedInMph, int range, long price) {
		super(model, speedInMph, range, price);
	}
	

	@Override
	public void fly() {
		super.fly();
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return super.getModel();
	}

	@Override
	public void setModel(String model) {
		// TODO Auto-generated method stub
		super.setModel(model);
	}

	@Override
	public double getSpeedInMph() {
		// TODO Auto-generated method stub
		return super.getSpeedInMph();
	}

	@Override
	public void setSpeedInMph(double speedInMph) {
		// TODO Auto-generated method stub
		super.setSpeedInMph(speedInMph);
	}

	@Override
	public double getRange() {
		// TODO Auto-generated method stub
		return super.getRange();
	}

	@Override
	public void setRange(int range) {
		// TODO Auto-generated method stub
		super.setRange(range);
	}

	@Override
	public long getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice();
	}

	@Override
	public void setPrice(long price) {
		// TODO Auto-generated method stub
		super.setPrice(price);
	}

	@Override
	public String toString() {
		return "FighterJet model: " + getModel() + ", Speed: " + getSpeedInMph() 
		+ "MPH , Range: " + getRange() + ", Price: $ " + getPrice();
	}

	public void dogFight() {
		System.out.println("Welcome to the Danger Zone!");
		
	}

	@Override
	public void hostilesDetected() {
		System.out.println("I'm picking up some boogies on my six!");
		
	}

	@Override
	public void targetLocked() {
		System.out.println("Locked on! Firing missiles!");
		
	}

	@Override
	public void smokeScreen() {
		System.out.println("Can't it what you can't see!");
	}




}
