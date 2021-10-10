package com.hemebiotech.analytics;

import java.util.TreeMap;
import java.util.List;
/**
 * Any Lists that needs to be organized
 */
public interface ListOrganizer {
    /**
     * If there's no data, return an empty list
     * @param rawListOfSymptoms a raw List of String that may or may not contain duplicates
     *  
     * @return a TreeMap of all the Symptoms found in the given file
     */
    TreeMap<String, Integer> organizeListOfSymptoms(List<String>rawListOfSymptoms);
}
