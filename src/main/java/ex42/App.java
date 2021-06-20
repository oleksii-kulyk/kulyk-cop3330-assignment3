/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Oleksii Kulyk
 */

package ex42;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    //create object File that looks for the .txt file with names
    //create object Scanner to scan from file
    public static File input42 = new File("exercise42_input.txt");
    public static Scanner input;

    public static void main(String[] Args) {
        //try to construct(initialize) object Scanner with the .txt names file
        try {
            input = new Scanner(input42);
        }
        //catch an exception if can't fine the file "exercise42_input.txt"
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //create an instance of the Parser class and use its methods to parse and print the CSV file
        Parser P = new Parser();
        P.read(input);
        System.out.print(P.print_CSV(P.CSVList));
    }
}

/*
Exercise 42 - Parsing a Data File

Sometimes data comes in as a structured format that you have to break down and turn into records so you can process them.
CSV, or comma-separated values, is a common standard for doing this.

Construct a program that reads in the following data file (you will need to create this data file yourself; name it `exercise42_input.txt`):

Ling,Mai,55900
Johnson,Jim,56500
Jones,Aaron,46000
Jones,Chris,34500
Swift,Geoffrey,14200
Xiong,Fong,65000
Zarnecki,Sabrina,51500

Process the records and display the results formatted as a table, evenly spaced, as shown in the example output.
Example Output

Last      First     Salary
--------------------------
Ling      Mai       55900
Johnson   Jim       56500
Jones     Aaron     46000
Jones     Chris     34500
Swift     Geoffrey  14200
Xiong     Fong      65000
Zarnecki  Sabrina   51500

Constraints

    Write your own code to parse the data. Don't use a CSV parser.
 */