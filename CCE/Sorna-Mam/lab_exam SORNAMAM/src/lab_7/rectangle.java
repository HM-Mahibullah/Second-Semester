/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_7;

/**
 *
 * @author ACER
 */
public class rectangle extends quardilate {
   public rectangle(point p1, point p2, point p3, point p4) {
 super(p1, p2, p3, p4);
 }  
 public double a()
 {
     return ((getp1().getx()-getp1().getx())*(getp4().gety()-getp1().gety()));
 }
    
}
