package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirField {
	//create ArrayList to hold jets
	private List<Jet> airFleet;
	


	public AirField() {
		super();
		this.airFleet = loadJets("jets.txt");
	}
	public void showFleet() {
		for (Jet jetType : airFleet) {
			System.out.println(jetType);
		}
	}
	public void flyFleet() {
		System.out.println("You are cleared for liftoff!");
		for (Jet jetType : airFleet) {
			jetType.fly();
		}
	}
	
// loop through list to find fastest and longest range	
	
	public void calcFastJet() {
		Jet fastest = airFleet.get(0);
		for (int i = 0; i < airFleet.size(); i++) {
			if (airFleet != null) {
				if (fastest.getSpeedInMph() < airFleet.get(i).getSpeedInMph()) {
					fastest = airFleet.get(i);
				}
			} 
		}
		System.out.println("The current fastest jet is: " + fastest);
	}
	public void calcRange() {
		Jet longestRange = airFleet.get(0);
		for (int i = 0; i < airFleet.size(); i++) {
			if (airFleet != null) {
				if (longestRange.getRange() < airFleet.get(i).getRange()) {
					longestRange = airFleet.get(i);
				}
			}
		}
		System.out.println("The jet with the longest range in the fleet is:\n" + longestRange);
	}
	
	// implement Interfaces
	public void dogFight() {
		for (Jet jetType : airFleet) {
			if(jetType instanceof FighterJet) {
				((FighterJet) jetType).hostilesDetected();
				((FighterJet) jetType).targetLocked();
			}
		}
		System.out.println("Flying right into the Danger Zone!");
		
	}
	public void cargo() {
		for (Jet jetType : airFleet) {
			if(jetType instanceof CargoPlane) {
				((CargoPlane) jetType).loadCargo();
				((CargoPlane) jetType).unloadCargo();
			}
		}
		
	}
	
	public void addJet(int choiceOfJet, String model, double speed, int range, long price) {
		
		Jet userJet = null;
		switch(choiceOfJet) {
		case 1: 
			userJet = new FighterJet(model, speed, range, price);
			break;
		case 2:
			userJet = new CargoPlane(model, speed, range, price);
			break;
		case 3:
			userJet = new PassengerPlane(model, speed, range, price);
			break;
		default:
			System.err.println("Invalid entry! Select option 1 - 3 for JET TYPE");
		}
		airFleet.add(userJet);
}
	public void removeJet(Scanner sc) {
		int userChoice = 0;
		System.out.println("Which jet do you want to remove from the fleet? ");
		for (int i = 0; i < airFleet.size(); i++) {
			System.out.println(i + 1 + ") " + airFleet.get(i).getModel());		
		}																		
		airFleet.remove(userChoice - 1); 
		
	}

public List<Jet> loadJets(String fileName) {
	List<Jet> jetData = new ArrayList<>();
	try (BufferedReader bufIn = new BufferedReader(new FileReader(fileName))) {
		String line;
		while ((line = bufIn.readLine()) != null) {
			Jet type;
			String[] jetFields = line.split(","); 		// The split lets the reader break up the txt file
			if (jetFields[4].equals("Fighter")) {		
				type = new FighterJet(jetFields[0], Double.parseDouble(jetFields[1]), Integer.parseInt(jetFields[2]),
						Long.parseLong(jetFields[3]));
			} else if (jetFields[4].equals("Cargo")) {
				type = new CargoPlane(jetFields[0], Double.parseDouble(jetFields[1]), Integer.parseInt(jetFields[2]),
						Long.parseLong(jetFields[3]));
			} else {
				type = new PassengerPlane(jetFields[0], Double.parseDouble(jetFields[1]), Integer.parseInt(jetFields[2]),
						Long.parseLong(jetFields[3]));
			}
			jetData.add(type);
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
	return jetData;
}
}