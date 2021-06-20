/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Oleksii Kulyk
 */

package ex42;

import java.util.ArrayList;
import java.util.Scanner;

public class Parser {
    ArrayList<String> CSVList = new ArrayList<String>();

    void read(Scanner input){
        //takes Scanner object from main() and reads names into the data structure above
        while(input.hasNextLine()) {
            CSVList.add(input.nextLine());
        }
    }

    //takes a String, in this case an element from ArrayList<String>,
    //looks for commas and formats with white spaces around commas; then returns formatted string
    String parse_CSVLine(String CSVLine){
            String[] splitCSV = CSVLine.split(",");
            return String.format("%-10s%-10s%-5s", splitCSV[0], splitCSV[1], splitCSV[2]);
    }

    //takes an ArrayList<String>, in this case CSVList, loops though it parsing each String element
    //then returns one big string for printing
    StringBuilder print_CSV(ArrayList<String> list){
        StringBuilder printVal = new StringBuilder("""
                Last      First     Salary
                --------------------------""");
        for(int i = 0; i < list.size(); i++){
            printVal.append("\n").append(parse_CSVLine(list.get(i)));
        }
        return printVal;
    }
}

/*
The idea is to input each line from the file as a separate String in the ArrayList.
Then, we loop through each index of the ArrayList to look for commas, split the string and format it accordingly.
Then, we print the formatted string.

Ling,Mai,55900
Johnson,Jim,56500
Jones,Aaron,46000
Jones,Chris,34500
Swift,Geoffrey,14200
Xiong,Fong,65000
Zarnecki,Sabrina,51500

Last      First     Salary
--------------------------
Ling      Mai       55900
Johnson   Jim       56500
Jones     Aaron     46000
Jones     Chris     34500
Swift     Geoffrey  14200
Xiong     Fong      65000
Zarnecki  Sabrina   51500

 */