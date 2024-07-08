/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301081011_180524;

/**
 *
 * @author ACER
 */
public class DecToOthers {
    public static void main(String args[]) {
        int num = Integer.parseInt(args[0]);
        int base = Integer.parseInt(args[1]);
        printBase(num, base);
    }
    static void printBase(int num, int base) {
        int rem = 1;
        String digits = "0123456789abcdef";
        String result = "";
        /* the iterative step */
        while (num!=0) {
            rem = num%base;
            num = num/base;
            result = result.concat(digits.charAt(rem)+"");
        }
        for (int i = result.length()-1; i >= 0; i--) {
            System.out.println(result.charAt(i));
        }
    }
}
