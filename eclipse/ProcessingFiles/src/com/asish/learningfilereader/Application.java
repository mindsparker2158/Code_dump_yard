package com.asish.learningfilereader;

import java.io.*;
import java.nio.Buffer;

public class Application {

	public static void main(String[] args)  {
		File file = new File("myfile.txt");
		BufferedReader bufferedreader = null;
		try {
			FileReader filereader = new FileReader(file);
			bufferedreader = new BufferedReader(filereader);
			
			String line = bufferedreader.readLine();
			while(line != null) {
				System.out.println(line);
				line = bufferedreader.readLine();
				
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		catch (IOException e) {
			e.printStackTrace();
			System.out.println("Problem reading the file" +file.getName());
		}
		finally {
			try {
				bufferedreader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Unable to close file" +file.getName());
			}
		}

	}

}
