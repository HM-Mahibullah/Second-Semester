
class Shape
{
  void printShape()
 {
 System.out.println("This is Shape");
 }
}
class Rectangless extends Shape{
  void printShape()
 {
 System.out.println("This is Rectangle");
 }
}
class Circle extends Shape
{
  void printShape()
 {
 System.out.println("This is circle");
 }
}
class Squaress extends Rectangless
{
  void printSquare()
 {
 System.out.println("Square is a Rectangle");
 }
}
public class Problem_6
{
 public static void main(String[] args) {
 Shape s= new Shape();
 Circle c = new Circle();
 Squaress sq = new Squaress();
 s.printShape();
 c.printShape();
 sq.printShape();
 sq.printSquare();
 }
}

