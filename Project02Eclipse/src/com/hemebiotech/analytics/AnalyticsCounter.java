package com.hemebiotech.analytics;

import java.util.Scanner;
import java.util.List;

public class AnalyticsCounter {
	public static void main(String args[]) throws Exception {
		
		//Asks the user to enter a path to the file
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Please enter the path to the file that will be read");
		String filename = inputScanner.nextLine();
		inputScanner.close();

		ReadSymptomDataFromFile rSymptomsFromFile = new ReadSymptomDataFromFile(filename);

		//Stores the raw content of the file in a List of String
		List<String> listOfSymptoms = rSymptomsFromFile.GetSymptoms();
		
		// next generate output
		/*FileWriter writer = new FileWriter ("result.out");
		writer.write("headache: " + headacheCount + "\n");
		writer.write("rash: " + rashCount + "\n");
		writer.write("dialated pupils: " + pupilCount + "\n");
		writer.close();*/
	}
}
