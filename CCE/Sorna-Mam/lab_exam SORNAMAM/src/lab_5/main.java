package lab_5;

public class main {
    public static void main(String[] args) {
        rectangle r = new rectangle(10, 20);
        System.out.println("Area = " + r.getarea());
        System.out.println("Perimeter = " + r.getPerimeter());

      squre []s=new squre[15];
      for(int i=0;i<s.length;i++)
      {
          s[i]=new squre(i+5);
          
      }
      for(int i=0;i<s.length;i++)
      {
          System.out.println("AREA of"+(i+1)+"squre"+s[i].getPerimeter());
      }
    }
}
