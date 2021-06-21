/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Oleksii Kulyk
 */

package ex45;

import java.io.IOException;
import java.util.Scanner;

public class App {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] Args) throws IOException {
        //instantiate a helper class
        ReplaceW RW = new ReplaceW();
        //input the long string using a method from the helper class
        //search for a default path of the input file given in the problem statement
        RW.input_text(RW.defaultPath);
        //prompt for the name of the output file
        System.out.print("What do you want to call the output file? ");
        //read in the name of the output file
        String output = input.nextLine();
        //call the print method from the helper class to process and output the text to a file with the given name
        //in the current directory; append `.txt` at the end of the file name
        RW.print_text("./" + output + ".txt", "utilize", "use");
    }
}

/*
Exercise 45 - Word Finder

There will be times when you'll need to read in one file, modify it, and then write a modified version of that file to a new file.

Given an input file named `exercise45_input.txt`, read the file and look for all occurrences of the word utilize.
Replace each occurrence with use. Write the modified file to a new file.
Example Output

Given the input file of

One should never utilize the word "utilize" in writing. Use "use" instead.
For example, "She uses an IDE to write her Java programs" instead of "She
utilizes an IDE to write her Java programs".

The program should generate

One should never use the word "use" in writing. Use "use" instead.
For example, "She uses an IDE to write her Java programs" instead of "She
uses an IDE to write her Java programs".

Constraints

    Prompt for the name of the output file.
    Write the output to a new file.

 */