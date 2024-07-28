/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problem_2;

/**
 *
 * @author ACER
 */
public class main {
    public static void main(String[] args) {
        employee E=new employee("a",10,"1000","as",1000);
        manager m=new manager("a",10,"1000","as",1000);
        System.out.println("==================================");
        System.out.println("Employee Data");
        System.out.println("Name"+E.name);
        E.printsalary();
        
    }
    
}
