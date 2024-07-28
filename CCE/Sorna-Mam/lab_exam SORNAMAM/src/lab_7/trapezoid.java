/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 
package lab_7;

/**
 *
 * @author ACER
 
public class trapezoid extends quardilate {
    private double base_1;
    private double base_2;
    public trapezoid (point p1,point p2,point p3,point p4,double base_1,double base_2 )
    {
        super (p1,p2,p3,p4);
                this.base_1=base_1;
                this.base_2=base_2;
                
    }
    public double ara()
    {
        return (base_1+base_2)*(getp2().gety()-getp1().gety())/2;
        
    }
    
    
}
*/
package lab_7;
public class trapezoid extends quardilate
{
    private double base_1;
    private double base_2;
    public trapezoid(point p1,point p2,point p3,point p4,double base_1,double base_2)
    {
        super(p1,p2,p3,p4);
        this.base_1=base_1;
        this.base_2=base_2;
        
    }
    public double area()
    {
        return (base_1+base_2)*(getp2().gety()-getp1().gety())/2;
        
    }
}
