
package problem_5;

class Rectangle {
    Integer length;
    Integer width;

    public Rectangle(Integer length, Integer width) {
        this.length = length;
        this.width = width;
    }

    public Integer getArea() {
        return length * width;
    }

    public Integer getPerimeter() {
        return 2 * (length + width);
    }
}
