package basicPrograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FIleHandling {

	public static void main(String[] args) {
		
		String path= "C:\\Users\\vishw\\OneDrive\\Documents\\Credential.txt";
		
		
		try {BufferedReader reader= new BufferedReader(new FileReader(path));
		String line;
		while((line=reader.readLine())!=null) {
			System.out.println(line);
		}
		reader.close();
			
		} catch (IOException e) {
			System.out.println("Error occured while reading the file ");
		}
	}

}
