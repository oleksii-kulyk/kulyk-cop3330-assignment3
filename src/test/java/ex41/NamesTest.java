/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Oleksii Kulyk
 */

package ex41;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class NamesTest {

    ArrayList<String> names = new ArrayList<>(Arrays.asList("Ling, Mai", "Johnson, Jim", "Zarnecki, Sabrina",
            "Jones, Chris", "Jones, Aaron", "Swift, Geoffrey", "Xiong, Fong"));

    @Test
    void print_names_test() {
        Names N = new Names();
        N.namesList = names;
        N.sort_names();

    }
}