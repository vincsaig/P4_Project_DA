package com.hemebiotech.analytics;

import java.util.Scanner;

public class AnalyticsCounter {
	public static void main(String args[]) throws Exception {
		
		Scanner inputScanner = new Scanner(System.in);

		System.out.println("Please enter the path to the file that will be read");

		String filename = inputScanner.nextLine();

		inputScanner.close();

		ReadSymptomDataFromFile rSymptomsFromFile = new ReadSymptomDataFromFile(filename);


		// next generate output
		/*FileWriter writer = new FileWriter ("result.out");
		writer.write("headache: " + headacheCount + "\n");
		writer.write("rash: " + rashCount + "\n");
		writer.write("dialated pupils: " + pupilCount + "\n");
		writer.close();*/
	}
}
