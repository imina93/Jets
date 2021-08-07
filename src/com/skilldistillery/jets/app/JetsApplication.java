package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.Jet;

public class JetsApplication {
	private AirField airfield;

	public static void main(String[] args) {
		// Create object to run the program
		JetsApplication run = new JetsApplication();
		// read list of jets into method
		String fileName = "Jets.txt";
		// Create scanner
		Scanner kb = new Scanner(System.in);

		// create a menu
		run.displayMenu();
		// create switch for menu options
		boolean menuOpen = true;
		int menuInput = kb.nextInt();
		while (menuOpen) {
			switch (menuInput) {
			case 1:
				try (BufferedReader bufIn = new BufferedReader(new FileReader(fileName))) {
					String line;
					while ((line = bufIn.readLine()) != null) {
						System.out.println(line);
					}
				} catch (IOException e) {
					System.err.println(e);
				}
				break;
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
				menuOpen = false;
				System.out.println("Thanks for flying with us!");
				break;
			}
		}
		kb.close();
	}

	private void displayMenu() {
		System.out.println("==========Fleet Menu==========");
		System.out.println("1. List fleet");
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
