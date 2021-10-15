package com.hemebiotech.analytics;

import java.util.Scanner;
import java.util.List;
import java.util.TreeMap;
public class AnalyticsCounter {
	public static void main(String args[]) throws Exception {
		
		//Asks the user to enter a path to the file
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Please enter the path to the file that will be read");
		String filename = inputScanner.nextLine();
		inputScanner.close();

		//Initialize the input
		ReadSymptomDataFromFile rSymptomsFromFile = new ReadSymptomDataFromFile(filename);

		//Stores the raw content of the file in a List of String
		List<String> listOfSymptoms = rSymptomsFromFile.GetSymptoms();
		
		//Remove duplicates from the raw list of symptoms
		OrganizeListOfSymptoms organizer = new OrganizeListOfSymptoms();
		TreeMap<String, Integer> sortedSymptoms = organizer.organizeListOfSymptoms(listOfSymptoms);
		
		//Generate output file
		WriteToOutputFile fileWriter = new WriteToOutputFile();
		String outputText = fileWriter.writerToOutputFile(sortedSymptoms);

		//Will tell the user wether the file creation process was successful or not
		System.out.print(outputText);
	}
}
