package filehandling;

import java.io.*;

public class Students2 implements Serializable {

    int sid;
    String name;
    String address;

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        
        System.out.println("Serialization started...");

        Students2  s1 = new Students2 ();
        s1.sid = 100;
        s1.name = "Ramjan";
        s1.address = "Jaipur";

        FileOutputStream fos = new FileOutputStream("students.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(s1);

        oos.close();
        fos.close();

     
        System.out.println("Deserialization started...");

        FileInputStream fis = new FileInputStream("students.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Students2  ss = (Students2 ) ois.readObject();

        System.out.println("ID: " + ss.sid);
        System.out.println("Name: " + ss.name);
        System.out.println("Address: " + ss.address);

        ois.close();
        fis.close();
    }
}