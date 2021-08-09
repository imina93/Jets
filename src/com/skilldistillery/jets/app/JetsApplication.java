package com.skilldistillery.jets.app;

import java.util.Scanner;


import com.skilldistillery.jets.entities.AirField;

public class JetsApplication {
	private AirField airfield;
	static Scanner kb = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Create object to run the program
		JetsApplication run = new JetsApplication();
		run.Startup(kb);
		
	}
		public void Startup(Scanner kb) {
			airfield = new AirField(); // (1b) ( (2b) populate the airfield)
			System.out.println("Hello and welcome to our Digital Fleet!");
			UserOption(kb);
		}
		
		public void UserOption(Scanner kb) {
		boolean menuOpen = true;
		
		// create switch for menu options
		while (menuOpen) {
			displayMenu();
			int menuInput = kb.nextInt();
			
			switch (menuInput) {
			case 1:
				airfield.showFleet();
				break;
			case 2:
				airfield.flyFleet();
				break;
			case 3:
				airfield.calcFastJet();
				break;
			case 4:
				airfield.calcRange();
				break;
			case 5:
				airfield.cargo();
				break;
			case 6:
				airfield.dogFight();
				break;
			case 7: //
				System.out.println("Which type of jet would you like to create?");
				System.out.println("1) FighterJet");
				System.out.println("2) CargoPlane");
				System.out.println("3) PassengerPlane");
				int choiceOfJet = kb.nextInt();
				System.out.print("Please enter model: ");
				String model = kb.next();
				System.out.print("Please enter speed(MPH): ");
				double speed = kb.nextDouble();
				kb.nextLine();
				System.out.print("Please enter range(miles): ");
				int range = kb.nextInt();
				System.out.print("Please enter price(USD): ");
				long price = kb.nextLong();
				airfield.addJet(choiceOfJet, model, speed, range, price);
				break;
			case 8:
				airfield.removeJet(kb);
				break;
			case 9:
				menuOpen = false;
				System.out.println("Thanks for digitally flying with us!");
				break;
			default:
				System.err.println("Invalid entry! Select option 1 - 9");
			}
		}
	
		
	}
	// create a menu
	private void displayMenu() {
		System.out.println("==========Fleet Menu==========");
		System.out.println("1. List curret fleet");
		System.out.println("2. Fly all jets");
		System.out.println("3. View fastest jet");
		System.out.println("4. View jet with longest range");
		System.out.println("5. Load all Cargo Jets");
		System.out.println("6. Dogfight!");
		System.out.println("7. Add a jet to Fleet");
		System.out.println("8. Remove a jet from Fleet");
		System.out.println("9. Quit");
		System.out.println("Please enter desired option number: ");
		System.out.println("==============================");

	}
}
