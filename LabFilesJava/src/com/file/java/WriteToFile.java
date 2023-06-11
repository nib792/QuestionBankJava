package com.file.java;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class WriteToFile {
    public static void main(String[] args) {
        FileWriter myWriter = null;
        try {
            myWriter = new FileWriter("fileWrite.txt");
            myWriter.write("Writing inside of a text file in java");
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } finally {
            if (myWriter != null) {
                try {
                    myWriter.close();
                } catch (IOException e) {
                    System.out.println("Error while closing the file writer.");
                    e.printStackTrace();
                }
            }
        }
    }
}
