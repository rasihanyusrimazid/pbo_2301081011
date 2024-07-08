/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301081011_180524;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author ACER
 */
  import java.io.*;
public class ReadFile {
  
     public static void main(String[] args) throws IOException {
        System.out.println("What is the name of the file to read from?");
        String filename;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        filename = br.readLine();
        System.out.println("now reading from" + filename + "...");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(filename);
        }catch (FileNotFoundException ex) {
            System.out.println("File not found.");
        }
        try {
            char data;
            int temp;
            do {
                temp = fis.read();
                data = (char) temp;
                if (temp != -1) {
                    System.out.print(data);
                }
            }while (temp != -1);
        }catch (IOException ex) {
            System.out.println("problem in reading from the file.");
        }
     }

}  
