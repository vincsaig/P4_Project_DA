package com.hemebiotech.analytics;

import java.util.TreeMap;
import java.util.List;
import java.util.Collections;
public class OrganizeListOfSymptoms implements ListOrganizer{

    @Override
    public TreeMap<String, Integer> organizeListOfSymptoms(List<String> rawListOfSymptoms){
        //Using a HashMap to remove any duplicates found in the
        //given List

        TreeMap<String, Integer> sortedSymptoms = new TreeMap<>();
        for(String symptom : rawListOfSymptoms){
            sortedSymptoms.put(symptom,Collections.frequency(rawListOfSymptoms, symptom));
        }
        return sortedSymptoms;
}
}