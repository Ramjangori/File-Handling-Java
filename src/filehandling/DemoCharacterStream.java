package filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

/*
 Character Stream in Java

 Character Stream is used to read and write data character by character.
 It uses Unicode (16-bit) characters.

 Character Streams are mainly used for TEXT FILES
 such as .txt, .java, .xml etc.

 Main Classes:
    Writer  -> used to write character data into file
    Reader  -> used to read character data from file

 Both Writer and Reader are ABSTRACT classes.
 So we cannot create their objects directly.
 We create objects of their subclasses.

 Examples of subclasses:
    FileReader  -> used to read characters from file
    FileWriter  -> used to write characters into file
*/

public class DemoCharacterStream {

    public static void main(String[] args) throws IOException {

        // Creating object of FileReader to read characters from file
        FileReader r = new FileReader("Demo.txt");
        FileInputStream f = new FileInputStream("Demo.txt");
//        System.out.println( (char)r.read()); // read character by character 
//        System.out.println((char)f.read()); // read byte by byte 
  
        int i = r.read();
        while(i!=-1) {
        	System.out.println((char)i);
        	i = r.read();
        }
    }
}