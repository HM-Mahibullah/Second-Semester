
package exception;
public class t {

    public static void so() throws Exception
            {
        throw new Exception("some class" );
              }
    public void so1() throws Exception
            {
               so(); 
            }
    







    public static void main(String[] args)
{
        try
{
           so();
        
  } 
catch (Exception e) {
        e.printStackTrace();
        }
    
}
}
