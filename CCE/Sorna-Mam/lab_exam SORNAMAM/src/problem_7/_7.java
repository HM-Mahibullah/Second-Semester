class Point{
 private double x;
 private double y;
 public Point(double x, double y)
 {
 this.x = x;
 this.y = y;
 }
 public double getx() {
 return x;
 }
 public double gety()
 {
 return y;
 }
}
class Quadrilateral
{
 private Point p1;
 private Point p2;
 private Point p3;
 private Point p4;
 public Quadrilateral(Point p1,Point p2,Point p3,Point p4)
 {
 this.p1 = p1;
 this.p2 = p2;
 this.p3 = p3;
 this.p4 = p4;
 }
 public Point getP1() {
 return p1;
 }
 public Point getP2() {
 return p2;
 }
 public Point getP3() {
 return p3;
 }
 public Point getP4() {
 return p4;
 }
 public double area() {
 return 0;
 }
}
class Trapezoid extends Quadrilateral
{
 private double base1;
 private double base2;
 public Trapezoid(Point p1,Point p2,Point p3,Point p4,double base1,double base2)
 {
 super(p1,p2,p3,p4);
 this.base1 = base1;
 this.base2 = base2;
 }
 public double area()
 {
 return (base1 + base2) * (getP2().gety() -getP1().gety())/2;
 }
}
class Parallelogram extends Quadrilateral {
 public Parallelogram(Point p1, Point p2, Point p3, Point p4) {
 super(p1, p2, p3, p4);
 }
 public double area() {
 return (getP2().getx() - getP1().getx()) * (getP4().gety() - getP1().gety());
 }
}
class Rectangle extends Parallelogram {
 public Rectangle(Point p1, Point p2, Point p3, Point p4) {
 super(p1, p2, p3, p4);
 }
 @Override
 public double area() {
 return (getP2().getx() - getP1().getx()) * (getP4().gety() - getP1().gety());
 }
}
class Ssquare extends Rectangle {
 public Ssquare(Point p1, Point p2, Point p3, Point p4) {
 super(p1, p2, p3, p4);
 }
 
 public double area() {
 return (getP2().getx() - getP1().getx()) * (getP4().gety() - getP1().gety());
 }
}
public class _7 {
 public static void main(String[] args) {
 Point p1 = new Point(0,0);
 Point p2 = new Point(10, 0);
 Point p3 = new Point(10, 5);
 Point p4 = new Point(0, 5);
 Trapezoid t = new Trapezoid(p1,p2,p3,p4,10,5);
 Parallelogram p = new Parallelogram(p1,p2,p3,p4);
 Rectangle r = new Rectangle(p1,p2,p3,p4);
 Ssquare sq = new Ssquare(p1,p2,p3,p4);
 System.out.println("Area of trapezoid:"+ t.area());
 System.out.println("Area of parallelogram:"+p.area());
 System.out.println("Area of rectangle:"+r.area());
 System.out.println("Area of square:"+ sq.area());
 }
}