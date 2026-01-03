package FileReadWrite;

import java.io.*;

public class FileReadWrite {
	
	public static void main(String[] args) {

        try {
            // Create FileWriter object
            FileWriter writer = new FileWriter("data.txt");

            // Writing text to file
            writer.write("Hello Java File Handling\n");
            writer.write("This is file write example");

            // Close the file
            writer.close();

            System.out.println("Data written to file successfully");
        }
        catch (IOException e) {
            System.out.println("Error while writing file");
            e.printStackTrace();
        }
        
        
        
        try {
            // Create FileReader object
            FileReader reader = new FileReader("data.txt");

            int ch;
            // Read character by character
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

            // Close the file
            reader.close();
        }
        catch (IOException e) {
            System.out.println("Error while reading file");
            e.printStackTrace();
        }
    }
}
