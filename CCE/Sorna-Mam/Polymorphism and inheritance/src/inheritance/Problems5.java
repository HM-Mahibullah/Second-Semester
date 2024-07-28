import java.util.Scanner;

class Rectangles{
    double length;
    double breadth;
    public Rectangles(double length,double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    public double areaCalculation()
    {
        return length * breadth;
    }
}
class Squares extends Rectangles{
    public Squares(double side)
    {
        super(side,side);
    }
}


public class Problems5 {
    public static void main(String[] args) {

       Squares[] sq = new Squares[15];
       for (int i=0;i<sq.length;i++)
       {
            sq[i] = new Squares(i+5);
       }
       for (int i=0;i<sq.length;i++)
       {
           System.out.println( "square is : " + sq[i].areaCalculation());
       }

    }
}
