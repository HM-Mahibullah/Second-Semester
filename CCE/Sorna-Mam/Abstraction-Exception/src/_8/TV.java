package _8;
public class TV implements  smartTVremote {

     public void turnon ()
     {
         System.out.println("Tv is turnon");
     }
   
     public void turnof ()
     {
         System.out.println("TV is turnoff");
     }
     @Override
     public void  connecttointernet()
     {
         System.out.println("connect to internet");
     }
     public void voicecotrol()
             
     {
         System.out.println("function has voicecontrol");
     }
    

    //@Override
    //public void voicecotrol() {
    //    throw new UnsupportedOperationException("Not supported yet.");
    }
   
    

