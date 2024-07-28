
package _2;

public class Main {
    public static void main(String[] args) {
        Subclass sub=new Subclass(10,15);
        System.out.println("Initilize"+ sub.getData1());
        System.out.println("Last value="+sub.getData2()); 
        System.out.println(sub.checkcondition());
       sub.setData1(20);
       sub.setData2(28);
       
        
         System.out.println("updat Initilize"+ sub.getData1());
        System.out.println("update Last value="+sub.getData2()); 
        System.out.println(sub.checkcondition());
        
    }
    
}
