
  package lab_exam;

   class parent
   {
       void print()
       {
       System.out.println("This id parent");
       }
       }

   class child extends parent
   {
           void printtwo()
   {
       System.out.println("This is child");
   }
   }
   public class test {
       public static void main(String[] args) {
           parent p=new parent();
           p.print();
           child c=new child();
           c.printtwo();
           c.print();
           
           
       }
}
