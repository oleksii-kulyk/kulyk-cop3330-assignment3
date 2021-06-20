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
    public static File input41 = new File("exercise41_input.txt");
    public static Scanner input;

    public static void main(String Args[]) {
        try {
            input = new Scanner(input41);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Names N = new Names();
        N.read_names(input);
        N.sort_names();
        try {
            N.print_names();
        } catch (IOException e) {
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