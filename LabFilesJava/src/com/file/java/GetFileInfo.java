package com.file.java;

import java.io.File;

public class GetFileInfo {
    public static void main(String[] args) {
        File myobj = new File("newFile.txt");
        if (myobj.exists()) {
            System.out.println("File name:" + myobj.getName());
            System.out.println("Absolute Path:" + myobj.getAbsolutePath());
            System.out.println("Writeable " + myobj.canWrite());
            System.out.println("Readable " + myobj.canRead());
            System.out.println("File size in bytes " + myobj.length());
        } else {
            System.out.println("File doesnot exist");
        }
    }
}
