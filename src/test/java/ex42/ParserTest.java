/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Oleksii Kulyk
 */

package ex42;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParserTest {

    Parser P = new Parser();
    @Test
    void parse_CSVLine_test() {
        String expected = "Ling      Mai       55900";
        String test_input = "Ling,Mai,55900";
        Assertions.assertEquals(expected, P.parse_CSVLine(test_input));
    }
}