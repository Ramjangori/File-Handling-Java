package filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Students implements Serializable{
	String name;
	int roll;
	String address;
	
	Students(String name , int roll , String address){
		this.name = name ;
		this.roll = roll;
		this.address = address;
	}
}

public class demo2Serialization {
   public static void main(String[] args) throws IOException{
	   Students s1 = new Students("Ramjan" , 1 , "Jaipur");
	   File f1 = new File("Demo.txt");
	   FileOutputStream fos = new FileOutputStream(f1);
	   ObjectOutputStream oos = new ObjectOutputStream(fos);
	   oos.writeObject(s1);

       oos.close();
       System.out.println("Data insert Sucessfully...");
}
}
