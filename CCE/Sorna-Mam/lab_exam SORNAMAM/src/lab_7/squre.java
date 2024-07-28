/*package lab_7;

public class squre extends rectangle{
    public squre(point p1,point p2,point p3,point p4)
    {
        super(p1,p2,p3,p4);
}
    public double area()
    {
        return ((getp1().getx()-getp1().getx())*(getp4().gety()-getp1().gety()));
    }
    
    
}
*/
package lab_7;
public class squre extends rectangle
{
    public squre (point p1,point p2,point p3,point p4)
    {
        super(p1,p2,p3,p4);
    }
    public double ar()
    {
      return ((getp2().getx()-getp1().getx())*(getp4().gety()-getp1().gety()));  
    }
}

