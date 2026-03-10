package filehandling;
import java.io.File;
import java.io.IOException;
public class demo1 {
   public static void main(String[] args) throws IOException{
	File f = new File("D\\B\\C");
	f.mkdirs(); // Creating Direcctories 
	File f2 = new File("Demo.txt");
	f2.createNewFile(); // creating new File is not exits
	File f3 = new File("A");
	String s[] = f3.list(); // return all file and folder in side A dir in a String or array 
	for(String sh : s) {
		System.out.println(sh);
	}
}
}
