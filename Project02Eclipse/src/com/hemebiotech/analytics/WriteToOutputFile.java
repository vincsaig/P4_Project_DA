package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.TreeMap;

public class WriteToOutputFile implements OSymptomWriter{

    @Override
    public String writerToOutputFile(TreeMap<String,Integer> organizedListOfSymptoms){
        //Try to create/edit a file, if the list is empty or the file
        //creation/edition fail, return an error
        if(!organizedListOfSymptoms.isEmpty()){
            try(FileWriter oFile = new FileWriter("result.out")){
                for(Entry<String, Integer> wLine : organizedListOfSymptoms.entrySet()){
                    oFile.write(wLine.getKey() + " : " + wLine.getValue() + "\n");
                }
                oFile.close();
                return "File was generated successfully";
            }   
            catch(IOException e){
                return "File was not generated successfully";
            }
        } else{
            return "No Data in Map";
        }
    }

}