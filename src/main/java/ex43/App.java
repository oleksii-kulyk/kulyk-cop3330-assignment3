/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Oleksii Kulyk
 */

package ex43;

import java.util.Scanner;

public class App {
    public static Scanner input = new Scanner(System.in);

    public static void main (String[] Args){
        //create a SiteBuilder instance
        SiteBuilder S = new SiteBuilder();

        //read and store site name within the SiteBuilder instance
        System.out.print("Site name: ");
        S.siteName = input.nextLine();

        //read and store author name within the SiteBuilder instance
        System.out.print("Author: ");
        S.siteAuthor = input.nextLine();

        //prompt for a js folder
        char js;
        System.out.print("Do you want a folder for JavaScript? ");
        js = input.next().charAt(0);

        //prompt for a css folder
        char css;
        System.out.print("Do you want a folder for CSS? ");
        css = input.next().charAt(0);

        //create folders
        //parent folder
        System.out.println(S.create_dir(S.Path + S.siteName));
        //js folder
        if(js == 'y' || js == 'Y')
            System.out.println(S.create_dir(S.Path + S.siteName + "/js/"));
        //css folder
        if(css == 'y' || css == 'Y')
            System.out.println(S.create_dir(S.Path + S.siteName + "/css/"));

        //Write index.html file
        System.out.println(S.write_index(S.siteName, S.siteAuthor, S.Path + S.siteName));
    }
}

/*
Exercise 43 - Website Generator

Programming languages can create files and folders too.

Create a program that generates a website skeleton with the following specifications:

    Prompt for the name of the site.
    Prompt for the author of the site.
    Ask if the user wants a folder for JavaScript files.
    Ask if the user wants a folder for CSS files.
    Generate an index.html file that contains the name of the site inside the <title> tag and the author in a <meta> tag.

Example Output

Site name: awesomeco
Author: Max Power
Do you want a folder for JavaScript? y
Do you want a folder for CSS? y
Created ./website/awesomeco
Created ./website/awesomeco/index.html
Created ./website/awesomeco/js/
Created ./website/awesomeco/css/

The user should then find these files and directories created in the working directory of your program.
 */