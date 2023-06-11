package com.file.java;

import java.io.File;
//import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        Scanner myReader = null;
        try {
            File myObj = new File("fileWrite.txt");
            myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        } finally {
            if (myReader != null) {
                myReader.close();
            }
        }
    }
}
