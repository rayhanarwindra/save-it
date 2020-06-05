package Utilities;

import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter {
    public static void printToFile(String fileName, String fileContent){
        try{
            FileWriter writer = new FileWriter(fileName);
            writer.write(fileContent);
            writer.close();
        }catch(IOException e){
            System.out.println("Error when writing to file " + fileName);
        }
    }
    
}