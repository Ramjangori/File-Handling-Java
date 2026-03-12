package com.characterStream;

// Character Stream: used to read and write character data (text files)

/*
 Classes in Character Stream:

 1. Reader  -> used to read data from source like file, keyboard, network etc.
 2. Writer  -> used to write data to destination like file, screen, network etc.

 Both Reader and Writer are abstract classes.

 These classes provide methods for reading and writing characters.

 Common subclasses:
    FileReader
    FileWriter
    BufferedReader
    BufferedWriter
*/

import java.io.FileReader;
import java.io.FileWriter;

public class Demo1 {

    public static void main(String[] args) throws Exception {

        // Writing data to file
        FileWriter fw = new FileWriter("demo.txt");
        fw.write("Hello Java");
        fw.close();

        // Reading data from file
        FileReader fr = new FileReader("demo.txt");

        int ch;

        while((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }

        fr.close();
    }
}