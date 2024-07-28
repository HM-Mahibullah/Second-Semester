/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proble_6;

class s
{
    void print()
    {
        System.out.println("this is shape");
    }
}
    class r extends s
            
    {
        void print()
        {
            System.out.println("this is rectangle shape");
        }
        
    }
    class circle extends s
    {
        void print()
        {
            System.out.println("this is circular shape");
        }
        
    }
    class squre extends r
    {
        void prints()
        {
            System.out.println("squre is rectangle");
        }
    }
    

public class Shape
{
    public static void main(String[] args) {
        squre sa=new squre();
        sa.prints();
        ((s)sa).print();
    }
}
