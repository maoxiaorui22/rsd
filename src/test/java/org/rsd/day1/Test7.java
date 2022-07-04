package org.rsd.day1;

import java.io.File;

public class Test7 {

    static void printFileName(String path) {
        File file = new File(path);
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                printFileName(f.getPath());
            } else {
                System.out.println(f.getName());
            }
        }
    }
    public static void main(String[] args) {
        printFileName("D:/rsd");

    }

}
