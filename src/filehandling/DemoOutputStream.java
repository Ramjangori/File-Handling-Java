package filehandling;
// OutputStream class used to write data into file or flow data outside the program 
// it is abstract class 
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
public class DemoOutputStream {
	public static void main(String[] args) throws IOException {

		 // Creating OutputStream object
        OutputStream fos = new FileOutputStream("demo.txt");

        // 1️⃣ write(int b) -> write single byte
        fos.write('H');
        fos.write('i');
        fos.write('\n');

        // 2️⃣ write(byte[] b) -> write full byte array
        String str = "Hello Ramjan";
        byte b[] = str.getBytes();
        fos.write(b);
        fos.write('\n');

        // 3️⃣ write(byte[] b, int off, int len) -> write part of array
        String str2 = "JavaProgramming";
        byte b2[] = str2.getBytes();

        fos.write(b2, 4, 7);   // start index 4, length 7
        fos.write('\n');

        // 4️⃣ flush() -> force data to write in file
        fos.flush();

        // 5️⃣ close() -> close stream
        fos.close();

        System.out.println("Data written successfully");

    }}