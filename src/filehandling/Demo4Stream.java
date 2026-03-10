package filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

// Stream -> Flow of data between Program and File
// Example:
// File -> Program (Reading)
// Program -> File (Writing)

/*
 Mainly two types of Streams

 1️⃣ Byte Stream (1 byte = 8 bits)
    Used for binary data like image, audio, video

    Classes:
    - InputStream  -> data transfer from File to Program
    - OutputStream -> data transfer from Program to File

    Example:
    FileInputStream
    FileOutputStream


 2️⃣ Character Stream (2 bytes)
    Used for character/text data

    Classes:
    - Reader -> data transfer from File to Program
    - Writer -> data transfer from Program to File

    Example:
    FileReader
    FileWriter
*/

public class Demo4Stream {

	public static void main(String[] args) throws IOException {

        // Creating stream object
        InputStream fis = new FileInputStream("demo.txt");
        // InputStream is abstract class so we create object of child class FileInputStream

        // 1️⃣ read()  -> reads one byte
        System.out.println((char) fis.read());
        System.out.println((char) fis.read());

        // 2️⃣ available() -> returns remaining bytes in file
        System.out.println("Available bytes: " + fis.available());

        // 3️⃣ read(byte[]) -> read multiple bytes
        byte arr[] = new byte[10];
        fis.read(arr);

        System.out.println("Reading using byte array:");
        for(byte b : arr){
            System.out.print((char)b);
        }

        System.out.println();

        // 4️⃣ skip() -> skip bytes
        fis.skip(2);
        System.out.println("After skipping 2 bytes: " + (char)fis.read());

        // 5️⃣ close() -> close the stream
        fis.close();
        System.out.println("\nStream closed");

    }
}
