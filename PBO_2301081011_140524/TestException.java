/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PBO_2301081011_140524;

/**
 *
 * @author ACER
 */
public class TestException {
    public static void main(String[] args) {
        try {
        for (int i = 0; true; i++) {
            System.out.println("args[" + i + "] = "
                    + args[i]);
        }
        } catch (Exception ex) {
            System.out.println("Error    :" + ex.getMessage());
        }
        
    }
    
}
