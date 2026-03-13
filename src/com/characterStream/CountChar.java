package com.characterStream;
// Character count in file 

import java.io.FileInputStream;
import java.io.IOException;

public class CountChar {
   public static void main(String[] args) throws IOException {
	   FileInputStream fis = new FileInputStream("Demo.txt");
	   int count = 0;
	   int ch;

	   while((ch = fis.read()) != -1){
	       if(ch != ' ') {
	           count++;
	       }
	   }

	   System.out.println("Characters without space: " + count);
   }
  

}

