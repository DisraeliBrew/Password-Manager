// --== CS400 File Header Information ==--
// Name: Rishi Agrawal
// Email: ragrawal25@wisc.edu
// Team: LD
// Role: Data Wrangler
// TA: Divyanshu Saxena
// Lecturer: Gary Dahl


/**
 * This class handles the IO of the program to a file "PasswordDetails.txt"
 *
 * @author Rishi Agrawal
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileHandler {
    private ArrayList<String> userData = new ArrayList<String>();
    String fileName;
    

    public FileHandler(String fileName) {
        this.fileName=fileName;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line = reader.readLine();
            while(line !=null){
                userData.add(line);
              
                line = reader.readLine();
            }
            reader.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    
    public ArrayList<String> getUserData() {
        return userData;
    }


    public void addUserData(String line){
        userData.add(line);
    }


  

    public void updateFile(){
        BufferedWriter writer;
        try {
            writer = new BufferedWriter(new FileWriter(fileName));
            for (int x = 0; x<userData.size(); x++){
                writer.write(userData.get(x));
                writer.newLine();
            }
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
