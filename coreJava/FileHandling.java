package coreJava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling{

    private static final String path = "demo.txt";

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter content: ");
        String userInput = scanner.nextLine();

       
        writeToFile(userInput);

       
        String output = readFromFile();
        System.out.println("\nContent read from the file:\n" + output);

        
        scanner.close();
    }

    private static void writeToFile(String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            writer.write(content);
            System.out.println("Content successfully written to the file.");
        } catch (IOException e) {
            System.err.println("ERROR " + e.getMessage());
        }
    }

    private static String readFromFile() {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            System.err.println("ERROR " + e.getMessage());
        }
        return content.toString();
    }
}
