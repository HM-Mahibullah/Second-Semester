package _7;
public class Area extends Shape  {
  
    @Override
  public  double RectangleArea(double l,double wedth)
   {
       return l*wedth;
   }
    @Override
    public double SqureArea (double length)
   {
       return length*length;
   }
    @Override
   public double CircleArea(double radious)
   {
      return (Math.PI*radious*radious);
  }
 
   
   
   
}
