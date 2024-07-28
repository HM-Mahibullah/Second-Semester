package prob_6;
class Shape {
    public void printShape() {
        System.out.println("This is shape");
    }
}

class Rectangle extends Shape {
    public void printShape() {
        System.out.println("This is rectangular shape");
    }
}

class Circl extends Shape {
    public void printShape() {
        System.out.println("This is circular shape");
    }
}

class Square extends Rectangle {
    public void printSquare() {
        System.out.println("Square is a rectangle");
    }
}

public class circle {
    public static void main(String[] args) {
        Square square = new Square();

        // Calling the method of 'Shape' class using the object of 'Square' class
        square.printShape();

        // Calling the method of 'Rectangle' class using the object of 'Square' class
        square.printSquare();
    }
}
