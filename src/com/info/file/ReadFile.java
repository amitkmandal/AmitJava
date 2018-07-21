package com.info.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	public static void main(String[] args) {
		try {
			
			File file = new File("file.txt");
			if(!file.exists()) {
				file.createNewFile();
			}
			else {
				System.out.println("already exists");
			}
			
			//Filereader reads the text file in default encoding.
			FileReader fileReader = new FileReader(file);
			
			//always wrap the fileReader in Bufferedredaer
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			while((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			//always close the file after use.
			bufferedReader.close();
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
