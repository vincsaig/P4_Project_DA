package com.hemebiotech.analytics;

import java.util.TreeMap;
import java.util.List;
import java.util.Collections;
public class OrganizeListOfSymptoms implements ListOrganizer{

    @Override
    public TreeMap<String, Integer> organizeListOfSymptoms(List<String> rawListOfSymptoms){
        //Using a Treemap to remove any duplicates, count the number of occurences and organize 
        //the symptoms found in the given List

        TreeMap<String, Integer> sortedSymptoms = new TreeMap<>();
        for(String symptom : rawListOfSymptoms){
            sortedSymptoms.put(symptom,Collections.frequency(rawListOfSymptoms, symptom));
        }
        return sortedSymptoms;
}
}