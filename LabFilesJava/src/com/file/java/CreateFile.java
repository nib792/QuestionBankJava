package com.file.java;

import java.io.File; //File class
import java.io.IOException; //IOException class to handle the errors

public class CreateFile {
    public static void main(String[] args) {
        try {
            File myobj = new File("newFile.txt");

            if (myobj.createNewFile()) {
                System.out.println("File created : " + myobj.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
