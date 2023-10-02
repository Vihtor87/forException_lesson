/*
 * Блок try-with-resources
 * Обработка исключений на уровне выше по стеку
 * Собственные типы исключений
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class lesson3 {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("/VisualStudio/forExeption/lesson1.java");
                FileWriter writer = new FileWriter("/VisualStudio/forExeption/les1Copy.java");
                Scanner scanner = new Scanner(System.in)) {

            while (reader.ready()) {
                writer.write(reader.read());
            }
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception" + e.getClass().getSimpleName());
        }
        System.out.println("Copy DONE");
    }
}
