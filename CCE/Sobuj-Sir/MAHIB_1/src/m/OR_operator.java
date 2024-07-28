/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahib_1;

/**
 *
 * @author ACER
 */
public class OR_operator {
    public static void main(String[] args) {
        int a=10;
        int b=55;
        int c=20;
        System.out.println(a<b||a++<c);
        System.out.println(a);
        System.out.println(a<b|a++<c);
        System.out.println(a);
        int main=(a<b)?a:b;
        System.out.println(main);
        a=a+b;
        System.out.print(a);
    }
    
}
