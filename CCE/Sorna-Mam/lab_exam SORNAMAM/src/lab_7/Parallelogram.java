/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_7;

/**
 *
 * @author ACER
 */
public class Parallelogram  extends quardilate{
    public Parallelogram (point p1,point p2,point p3,point p4)
    {
        super (p1,p2,p3,p4);
        
    }
    public double are()
    {
        return ((getp2().getx()-getp1().getx())*(getp4().gety()-getp1().gety()));
        
    }
}
