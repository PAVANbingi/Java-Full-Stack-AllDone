import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Class containing file operation methods
class FileOperations {
    
    // Method to write to a file
    public static void writeFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
    
    // Method to read from a file
    public static void readFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Reading file content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
    
    // Method to append to a file
    public static void appendFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(content);
            System.out.println("File appended successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file: " + e.getMessage());
        }
    }
}

// Main class to demonstrate file operations
public class FileHandling {
    public static void main(String[] args) {
        String fileName = "example.txt";
        
        // Write to the file
        String contentToWrite = "Hello, World!\nWelcome to file operations in Java.";
        FileOperations.writeFile(fileName, contentToWrite);
        
        // Read from the file
        FileOperations.readFile(fileName);
        
        // Append to the file
        String contentToAppend = "\nThis is appended text.";
        FileOperations.appendFile(fileName, contentToAppend);
        
        // Read from the file again to see the appended content
        FileOperations.readFile(fileName);
    }
}
