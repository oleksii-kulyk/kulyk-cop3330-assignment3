/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Oleksii Kulyk
 */

package ex45;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
//it is hard to create a unit test here as all the methods are short
//and they all consist entirely of the standard java methods
public class ReplaceW {
    String text;
    String defaultPath = "./exercise45_input.txt";
    //I decided to use the nio functions from java 11 because they are very concise

    void input_text(String path) throws IOException {
        //creates a path object from a string
        Path pathObj = Paths.get(path);
        //this java 11 nio function reads the text as one long string
        text = Files.readString(pathObj);
    }

    String replace_word(String lookfor, String replace){
        //searches for occurrences of a word `lookfor` in the `text` String and replaces if with the word `replace`
        return text.replaceAll(lookfor, replace);
    }

    void print_text(String path, String lookfor, String replace) throws IOException {
        //uses replace_word as a helper method
        //creates a path given to it and prints the text into that path
        try {
            Path pathObj = Paths.get(path);
            Files.writeString(pathObj, replace_word(lookfor, replace));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
