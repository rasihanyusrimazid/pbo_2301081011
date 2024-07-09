
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class GanjilGenap {
    public static void main(String[] args){
        int a;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Bilangan Bulat : ");
        a = input.nextInt();
                if(a%2==0)
                    System.out.println(a + "merupakan bilangan genap");
                else //a mod 2=1
                    System.out.println(a + "merupakan bilangan ganjil");
    }
}
