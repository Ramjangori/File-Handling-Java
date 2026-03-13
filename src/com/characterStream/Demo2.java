package com.characterStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Program to read file line by line
public class Demo2 {

   public static void main(String[] args) throws IOException {

       // FileReader -> used to read character data from file
       FileReader f = new FileReader("Demo.txt");

       // BufferedReader -> adds buffering for fast reading and provides readLine() method
       BufferedReader b = new BufferedReader(f);

       // read first line from file
       String s = b.readLine();

       // loop until end of file (null means EOF)
       while(s != null) {
           System.out.println(s);   // print line
           s = b.readLine();        // read next line
       }
   }
}