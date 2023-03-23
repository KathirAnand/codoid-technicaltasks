package codoid.technicaltask.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadAndWrite {

	public static void main(String[] args) {
		// Create a File object representing the file to read/write
        File file = new File("example.txt");

        // Write to the file
        try (PrintWriter writer = new PrintWriter(file)) {
            writer.println("Hello, world!");
            writer.println("This is an example file.");
            writer.println("We are writing to this file.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Read from the file
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
		// TODO Auto-generated method stub

	}

}
/*
 * import java.io.*;

public class ReadWriteFileExample {
    public static void main(String[] args) {
        // Create a File object representing the file to read/write
        File file = new File("example.txt");

        // Write to the file
        try (PrintWriter writer = new PrintWriter(file)) {
            writer.println("Hello, world!");
            writer.println("This is an example file.");
            writer.println("We are writing to this file.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Read from the file
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

 */