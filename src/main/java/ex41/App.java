/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Oleksii Kulyk
 */

package ex41;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class App {
    //create object File that looks for the .txt file with names
    //create object Scanner to scan from file
    public static File input41 = new File("exercise41_input.txt");
    public static Scanner input;

    public static void main(String[] Args) {
        //try to construct(initialize) object Scanner with the .txt names file
        try {
            input = new Scanner(input41);
        }
        //catch an exception if can't fine the file "exercise41_input.txt"
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //use methods from a separate class to read, process the data, and print
        //create an instance of this separate class
        Names N = new Names();
        //read input into a data structure within the class
        N.read_names(input);
        //call sorting method on the data within the instance of the class
        N.sort_names();
        try {
            //a method within the class prints the sorted output
            //takes FileWriter object as an argument as a separate method in the Names class of responsible for creating the output file
            N.print_names(N.create_file());
        } catch (IOException e) {
            //handle the output error
            e.printStackTrace();
        }
    }
}

/*
Create a program that reads in the following list of names from a file called `exercise41_input.txt` and sorts the list alphabetically:

Ling, Mai
Johnson, Jim
Zarnecki, Sabrina
Jones, Chris
Jones, Aaron
Swift, Geoffrey
Xiong, Fong

Then print the sorted list to a file called `exercise41_output.txt` that looks like the following example output.
Example Output

Total of 7 names
-----------------
Johnson, Jim
Jones, Aaron
Jones, Chris
Ling, Mai
Swift, Geoffrey
Xiong, Fong
Zarnecki, Sabrina

Constraint
    Don't hard-code the number of names.
 */