/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301081011_180524;

/**
 *
 * @author ACER
 */
public class DecToOtherRecur {
    static void printBase(int num,int base){
        String digits="123456789abcdef";
        
        if(num>=base){
            printBase(num/base,base);
        }
        System.out.print(digits.charAt(num%base));
    }
    public static void main(String arqs[]){
        int num=Integer.parseInt(arqs[0]);
        int base=Integer.parseInt(arqs[1]);
        printBase(num,base);
        
    }
    
}
