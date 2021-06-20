/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Oleksii Kulyk
 */

package ex41;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Names {
    //no hard coded limit of the number of names, so taking a dynamic approach
    ArrayList<String> namesList = new ArrayList<String>();
    //counts number of lines to be later displayed in the output
    int numOfLines = 0;

    //uses standard java methods; nothing to debug here
    void read_names(Scanner input){
        //takes Scanner object from main() and reads names into above data structure
        while(input.hasNextLine()) {
            namesList.add(input.nextLine());
            //count number of lines
            numOfLines++;
        }
    }

    //sorts names in the natural (in this case alphabetically) order by modifying namesList
    //internal java methods have been debugged and are optimized to differently sized structures
    void sort_names(){
         Collections.sort(namesList);
    }

    //helper method to create the output file
    //also nothing to debug here
    FileWriter create_file() throws IOException {
        File ex41output = new File("exercise41_output.txt");
        ex41output.createNewFile();
        FileWriter Out = new FileWriter("exercise41_output.txt");
        return Out;
    }

    //takes a reference to the output file created by the method above and writes into in according to given format
    //has a unit test to check if the format is correct
    void print_names(FileWriter Out) throws IOException {
        Out.write("Total of " + numOfLines + " names\n-----------------\n");
        for(int i = 0; i < numOfLines; i++){
            Out.write(namesList.get(i)+'\n');
        }
        Out.close();
    }
}
