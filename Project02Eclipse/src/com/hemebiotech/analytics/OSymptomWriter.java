package com.hemebiotech.analytics;
import java.util.TreeMap;

/**
* Anything that will be used to generate an output file of symptoms
*/
public interface OSymptomWriter {
    
    /**
     * 
     * @param organizedListOfSymptoms TreeMap that contains all organized symptoms
     * @return A String telling the user wether the operation was successful or not
     */
    String writerToOutputFile(TreeMap<String,Integer> organizedListOfSymptoms);
}
