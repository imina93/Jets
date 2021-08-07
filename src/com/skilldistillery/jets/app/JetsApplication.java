package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.Jet;

public class JetsApplication {
	private AirField airfield;
	
	public static void main(String[] args) {
		// Create object to run the program
		JetsApplication run = new JetsApplication();
		// read list of jets into method
		String fileName = "Jets.txt";
		run.loadJets(fileName);
		
		run.displayMenu();
	
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
		System.out.println("==============================");
		
	}
//The method to parse a file into Jet objects should return a List<Jet>. Its parameter can be a String file name.
//	Remember to use String.split(regex) to break each line in the file into data to create an individual jet.

	private List<Jet> loadJets(String fileName) {
		  try ( BufferedReader bufIn = new BufferedReader(new FileReader(fileName)) ) {
		      String line;
		      while ((line = bufIn.readLine()) != null) {
		        System.out.println(line);
		      }
		    }
		    catch (IOException e) {
		      System.err.println(e);
		    }
		return null;
		  }

	//
	//
	//
		}
