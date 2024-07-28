
package problem_4;


public class rectangle {
    Integer length;
 Integer width;
 
 public rectangle(Integer length, Integer width) {
 this.length = length;
  this.width = width;
  }
  
 public int getArea() {
 return length * width;
}
 
 public Integer getPerimeter() {
 return 2 * (length + width);
}
 }


    

