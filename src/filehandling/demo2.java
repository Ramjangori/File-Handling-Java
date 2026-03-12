package filehandling;

import java.io.File;
import java.io.IOException;

public class demo2 {
 public static void main(String[] args) throws IOException {
	File a = new File("Demo6.txt");
	boolean check = a.createNewFile();
	if(check) {
		System.out.println("File Created Sucessfully...");
	}
	
}
}
