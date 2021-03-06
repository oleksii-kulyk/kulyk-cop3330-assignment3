/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Oleksii Kulyk
 */

package ex44;

import java.io.File;
import java.util.Scanner;

public class App {
    //create object File that looks for the .txt file with names
    //create object Scanner to scan from file
    public static File input44 = new File("exercise44_input.json");
    public static Scanner fileinput;
    public static Scanner stdinput = new Scanner(System.in);

    public static void main (String[] Args){
        //instantiates a helper class
        //calls a method from the helped class to read the data from the json file into the custom
        //data structure inside the helper class
        //loop queries the user for the product name
        //a method from the helped class looks for matches within the info in the data structure
        //if the match is found break from the loop
        //if no match is found keep looping
    }


}

/*
Exercise 44 - Product Search

Pulling data from a file into a complex data structure makes parsing much simpler.
Many programming languages support the JSON format, a popular way of representing data.

Create a program that takes a product name as input and retrieves the current price and quantity for that product.
The product data is in a data file in the JSON format  and looks like this (you will create this file as `exercise44_input.json`):

{
    "products" : [
        {"name": "Widget", "price": 25.00, "quantity": 5 },
        {"name": "Thing", "price": 15.00, "quantity": 5 },
        {"name": "Doodad", "price": 5.00, "quantity": 10 }
    ]
}

Print out the product name, price, and quantity if the product is found. If no product matches the search, state that no product was found and start over.
Example Output

What is the product name? iPad
Sorry, that product was not found in our inventory.
What is the product name? Galaxy
Sorry, that product was not found in our inventory.
What is the product name? Thing
Name: Thing
Price: 15.00
Quantity: 5

Constraints

    The file is in the JSON format. Use a JSON parser to pull the values out of the file (e.g. https://github.com/google/gson (Links to an external site.)).
    If no record is found, prompt again.

 */