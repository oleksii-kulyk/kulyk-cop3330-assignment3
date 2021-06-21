/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Oleksii Kulyk
 */

package ex43;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//i decided to use the newer java.nio.file library
public class SiteBuilder {
    String siteName;
    String siteAuthor;
    String Path = "./website/"; //default value

    String create_dir(String path){

        try {
            Path pathObj = Paths.get(path);
            Files.createDirectories(pathObj);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return String.format("Created %s", path);
    }

    //looked up a standard skeleton for index html
    //credit goes to https://gist.github.com/alyssaq/37645ef8af51768677e2
    String write_index(String name, String author, String path){
        //inserts website name and author name during initialization
        String content = String.format("""
                <!DOCTYPE HTML>
                <html>
                <head>
                    <meta charset="utf-8" />
                    <meta name="author" content="%2$s">
                    <title>%1$s</title>
                    <meta name="viewport" content="width=device-width, initial-scale=1" />
                    <script charset="utf-8" src="js/app.js"></script>
                    <link rel="stylesheet" href="css/app.css" />
                </head>
                <body>
                    <h1>Hello!</h1>
                </body>
                </html>""", name, author);

        //writes to file
        try {
            Path pathObj = Paths.get(path + "/index.html");
            Files.writeString(pathObj, content);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return String.format("Created ./website/%s/index.html", name);
    }
}
