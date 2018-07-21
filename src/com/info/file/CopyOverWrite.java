package com.info.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class CopyOverWrite {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the source file name with .txt extension ");
		String sourceFile = scanner.nextLine();
		
		System.out.println("Enter the destination file name with .txt extension ");
		String destFile = scanner.nextLine();
		
		InputStream inputStream = null;
		OutputStream outputStream = null;
		
		try {
			
			File file1 = new File(sourceFile);
			File file2 = new File(destFile);
			
			inputStream = new FileInputStream(file1);
			outputStream = new FileOutputStream(file2);
			
			byte[] buffer = new byte[1024];
			
			int length;
			while((length = inputStream.read(buffer)) > 0) {
				outputStream.write(buffer,0,length);
			}
			if(inputStream != null)
				inputStream.close();
			if(outputStream != null)
				outputStream.close();
			
			System.out.println("file copied ..");
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
