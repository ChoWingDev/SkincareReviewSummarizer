package com.chowingdev;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class ReviewCleaner 
{
    public static void main( String[] args )
    {
        String inputFile = "../raw_reviews.csv";
        String outputFile = "../cleaned_reviews.csv";

        try (CSVReader reader=new CSVReaderBuilder(new FileReader(inputFile)).withSkipLines(0).build();
             CSVWriter writer=new CSVWriter(new FileWriter(outputFile))){

                String[] headers=reader.readNext();
                if(headers!=null){
                    writer.writeNext(headers);
                }else{
                    System.out.println("No headers found!");
                }
                
                List<String[]> allRows=new ArrayList<>();
                String[] row;
                int rowCount=0;
                //infinite loop - breaks on null
                while (true) {
                    try {
                        row=reader.readNext();
                        if(row==null) break;
                        rowCount++;
                        if (row.length>9) {
                            String reviewText = row[9].toLowerCase().replaceAll("[^a-z0-9\\s]", "");
                            row[9]=reviewText;
                            allRows.add(row);
                        }
                    } catch (Exception e) {
                        System.out.println("Error at row"+rowCount+":"+e.getMessage());
                        continue;
                    }               
                }

                System.out.println("Total rows read:"+ rowCount);

                writer.writeAll(allRows);
                System.out.println("Cleaned data saved to " + outputFile + " with " + allRows.size() + " rows");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
