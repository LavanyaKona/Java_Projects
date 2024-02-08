package exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingExample {
    public static void main(String[] args) {

        String fileName1 = "todo.md";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName1))) {
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Executing catch block");
            e.printStackTrace();
        }

        String fileName2 = "C:\\Users\\1999l\\Desktop\\todo.md";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName2))) {
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Executing catch block");
            e.printStackTrace();
        }
    }
}

