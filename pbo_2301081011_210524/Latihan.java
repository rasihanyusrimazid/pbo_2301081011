/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301081011_210524;

/**
 *
 * @author ACER
 */
import java.io.*;
import java.util.Scanner;
public class Latihan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama file teks: ");
        String inputFileName = scanner.nextLine();
        System.out.print("Masukkan nama file output: ");
        String outputFileName = scanner.nextLine();

        try {
            File inputFile = new File(inputFileName);
            File outputFile = new File(outputFileName);

            Scanner fileScanner = new Scanner(inputFile);
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String modifiedLine = line.replaceAll(" ", "_");
                writer.write(modifiedLine);
                writer.newLine();
            }

            fileScanner.close();
            writer.close();

            System.out.println("File berhasil dikonversi.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
    

