package com.hemebiotech.analytics;

import java.util.TreeMap;
import java.util.List;
import java.util.HashMap;
import java.util.Collections;
public class OrganizeListOfSymptoms implements ListOrganizer{

    @Override
    public TreeMap<String, Integer> organizeListOfSymptoms(List<String> rawListOfSymptoms){
        //Using a HashMap to remove any duplicates found in the
        //given List
        HashMap<String, Integer> symptomsAndNumberOfOccurences = new HashMap<>();
        for(String symptom : rawListOfSymptoms){
            symptomsAndNumberOfOccurences.put(symptom,Collections.frequency(rawListOfSymptoms, symptom));
        }

        //Using a TreeMap to organize all the elements in alphabetical order
        TreeMap<String, Integer> sortedSymptoms = new TreeMap<>();
        sortedSymptoms.putAll(symptomsAndNumberOfOccurences);
        return sortedSymptoms;
}
}