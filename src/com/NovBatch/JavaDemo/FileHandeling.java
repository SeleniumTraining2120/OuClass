package com.NovBatch.JavaDemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandeling {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		/*File f = new File("D:\\Testing_Training\\ourClass1.txt");		
		f.createNewFile();		
		FileWriter fw = new FileWriter("D:\\Testing_Training\\ourClass1.txt");		
		BufferedWriter bw = new BufferedWriter(fw);		
		bw.write("Hi this is Selenium Training Calss.");		
		bw.newLine();		
		bw.write("Hi this new Line.");
		bw.flush();
		*/
		FileReader fr = new FileReader("D:\\Testing_Training\\ourClass.txt");
		BufferedReader br = new BufferedReader(fr);
		while(br.ready()) {
			System.out.println(br.readLine());
		}
		
	}

}
