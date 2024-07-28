class Shape
{
    public void printShape()
    {
        System.out.println("This is Shape");
    }
}
class Rectangless extends Shape{
    public void printShape()
    {
        System.out.println("This is Rectangle");
    }
}
class Circle extends Shape
{
    public void printShape()
    {
        System.out.println("This is circle");
    }
}
class Squaress extends Rectangless
{
    public void printSquare()
    {
        System.out.println("Square is a Rectangle");
    }
}


public class Problems6 {
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
