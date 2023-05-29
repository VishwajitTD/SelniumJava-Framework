package basicPrograms;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SaveToFile {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\vishw\\OneDrive\\Documents\\PathToSave\\FIle.txt\\";

        try {
            // Open the file for writing
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter text to save (type 'exit' to quit):");

            String input = scanner.nextLine();
            while (!input.equalsIgnoreCase("exit")) {
                // Write the input text to the file
                writer.write(input);
                writer.newLine();
            }

            writer.close();
            scanner.close();
            System.out.println("Text saved to the file.");
            
        } 
        catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
