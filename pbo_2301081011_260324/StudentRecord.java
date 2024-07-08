/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301081011_260324;

/**
 *
 * @author ACER
 */
public class StudentRecord {
    
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scieneGrade;
    private double average;
    
    private static int studentCount;
 
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public double getMathGrade() {
        return mathGrade;
    }
    
    public void setMathGrade(double mathGrade) {
        this.mathGrade = mathGrade;
    }
    
    public double getEnglishGrade() {
        return englishGrade;
    }
    
    public void setEnglishGrade(double englishGrade) {
        this.englishGrade = englishGrade;
    }
    
    public double getScieneGrade() {
        return scieneGrade;
    }
    
    public void setScieneGrade(double scieneGrade) {
        this.scieneGrade = scieneGrade;
    }
    
    public double getAverage() {
        average = (mathGrade+englishGrade+scieneGrade)/3;
        return average;
    }
    
   
    
    public static int getStudentCount() {
        return studentCount;
    }



    
}
