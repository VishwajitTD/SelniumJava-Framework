package basicPrograms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteInFIle {

	public static void main(String[] args) {
		String path="C:\\Users\\vishw\\OneDrive\\Documents\\PathToSave\\FIle.txt";
		try {
		BufferedWriter writer = new BufferedWriter(new FileWriter(path,true));
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Line to save: ");
		String input=sc.nextLine();
		writer.write(input);
		writer.newLine();
		
		writer.close();
		sc.close();
		}
		catch (IOException e) {
			System.out.println("Exception Handled");
		}

	}

}
