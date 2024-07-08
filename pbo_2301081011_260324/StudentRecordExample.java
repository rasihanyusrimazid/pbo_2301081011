/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301081011_260324;

/**
 *
 * @author ACER
 */
public class StudentRecordExample {
    public static void main(String[] args){
        StudentRecord student1 = new StudentRecord();
        student1.setName("Ali");
        student1.setAddress("Padang");
        student1.setAge(20);
        student1.setMathGrade(90);
        student1.setEnglishGrade(70);
        student1.setScieneGrade(80);
        
        ///
        System.out.println("Nama             :"+student1.getName());
        System.out.println("Alamat           :"+student1.getAddress());
        System.out.println("Umur             :"+student1.getAge());
        System.out.println("Matematika       :"+student1.getMathGrade());
        System.out.println("B. Inggris       :"+student1.getEnglishGrade());
        System.out.println("Ilmu Pengetahuan :"+student1.getScieneGrade());
        System.out.println("Rata             :"+student1.getAverage());
        
        //contoh pemanggilan method
        
        
        
    }
    
}
