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
    ArrayList<String> namesList = new ArrayList<String>();
    int numOfLines = 0;

    void read_names(Scanner input){

        while(input.hasNextLine()) {
            namesList.add(input.nextLine());
            numOfLines++;
        }
    }

    void sort_names(){
         Collections.sort(namesList);
    }

    void print_names() throws IOException {
        File ex41output = new File("exercise41_output.txt");
        ex41output.createNewFile();
        FileWriter Out = new FileWriter("exercise41_output.txt");
        Out.write("Total of " + numOfLines + " names\n-----------------\n");
        for(int i = 0; i < numOfLines; i++){
            Out.write(namesList.get(i)+'\n');
        }
        Out.close();
    }
}
