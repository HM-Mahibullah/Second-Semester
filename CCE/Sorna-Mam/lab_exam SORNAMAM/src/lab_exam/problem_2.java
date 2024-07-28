package lab_exam;
 class Parent{
    private void print()
     {
         System.out.println("This is parent");
     }
     
 }
  class Child extends Parent{

     void printtwo()
     {
         System.out.println("This is child");
     }
 }
 public class problem_2
 {
     public static void main(String[] args) {
         Parent p=new Parent();
        // p.print();
         Child c=new Child();
         c.printtwo();
       //  c.print();
         
     }
 }
    
    

