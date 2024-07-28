/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_5;

/**
 *
 * @author ACER
 */
public class rectangle {
    int length;
    int wedth;
    public rectangle(int l,int w)
    {
        this.length=l;
        this.wedth=w;
    }
    public int getarea()
    {
  return length * wedth;
}
 
 public Integer getPerimeter() {
 return 2 * (length + wedth);
}
 }
