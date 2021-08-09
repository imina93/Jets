package com.skilldistillery.jets.entities;

public class CargoPlane extends Jet implements CargoCarrier{

	@Override
	public void loadCargo() {
		System.out.println("Careful loading up! We get paid to fly it not break it!");
		
	}

	public CargoPlane() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CargoPlane(String model, double speedInMph, int range, long price) {
		super(model, speedInMph, range, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
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
		return "CargoJet model: " + getModel() + ", Speed: " + getSpeedInMph() 
		+ "MPH , Range: " + getRange() + ", Price: $ " + getPrice();
	}

	@Override
	public void unloadCargo() {
System.out.println("Made it without a single break!");		
System.out.println("-Something falls in the cargo bay-");		
System.out.println("...nevermind");		
	}

}
