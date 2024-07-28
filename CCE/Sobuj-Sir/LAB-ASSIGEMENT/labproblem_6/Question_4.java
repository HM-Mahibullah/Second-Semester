
package labproblem_6;

public class Question_4 {
    public static void main(String[] args) {
         int a[]={1,2,3,4,10,5,2};
    boolean b=true;
    for(int c:a)
    {
        
                
        if(c==10)
        {
            b=false;
        
        }
        if(b)
        {
            
                System.out.print(c+"");
        }
    }
    
}
}