/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructortest;
import java.util.*;
/**
 *
 * @author ASUS
 */
public class ConstructorTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Oleh :  dan Bening
        Catatan : 
        */
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Harry", 40000); 
        staff[1] = new Employee(60000); 
        staff[2] = new Employee(); 
        for (Employee e : staff) 
            System.out.println("name = " + e.getName() + ", id = " + e.getId() + ", salary = "+ e.getSalary()); 
    }  
}

 class Employee 
 {
     private static int nextId; 
     
     private int id; 
     private String name = ""; // instance field initialization 
     private double salary; 
     
     // static initialization block 
     //Baris kode di bawah adalah inisialisasi dari field dan object.
     static{
         Random generator = new Random(); 
         // set nextId to a random number between 0 and 9999 
         nextId = generator.nextInt(10000);
     }
     // object initialization block 
    {
        id = nextId; 
        nextId++; 
    }
    // three overloaded constructors 
     public Employee(String n, double s){
        name = n; 
        salary = s; 
     }
     public Employee(double s){
        // calls the Employee(String, double) constructor 
        this("Employee #" + nextId, s);
     }
     // the default constructor 
      public Employee(){
          // name initialized to ""--see above
           // salary not explicitly set--initialized to 0 
           // id initialized in initialization block
      }
       public String getName() {
           return name;
       }
       public double getSalary() {
           return salary;
       }
        public int getId() {
            return id;
        }
 }      
