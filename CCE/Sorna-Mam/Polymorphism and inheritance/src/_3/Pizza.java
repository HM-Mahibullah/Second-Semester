
package _3;
public final class Pizza {
    private String size;
    private int cheesetopins;
    private int pepperonitopins;
    private int hamtopins;
    public void  setcheesetopins(int cheesetopins)//Encaptulation settr method
    {
        this.cheesetopins=cheesetopins;
    }
      public void  setpepperonitopins(int pepperonitopins)
    {
        this.pepperonitopins=pepperonitopins;
    }
        public void  sethamtopins(int hamtopins)
    {
        this.hamtopins=hamtopins;
    }
        public void setsize(String size)
        {
            if(size.equals("small")||size.equals("medium")||size.equals("small"))
            {
                this.size=size;
            }
            else
            {
            System.out.println("Invalid size");
            }
        }
        public String  getsize ()
        {
            return size;
        }
        public int getcheesetopins()
        {
            return cheesetopins;
        }
        public int getpepperonitopins()
        {
            return pepperonitopins;
        }
        public  int gethamtopins()
        {
            return  hamtopins;
        }
        public  Pizza (String size,int cheesetopins,int pepperonitopins,int hamtopins  )//constructer Pizza
        {
            this.size=size;
            this.cheesetopins= cheesetopins;
            this.hamtopins=hamtopins;
            this.pepperonitopins=pepperonitopins;
      }
// overloaded constructor  
      //  public Pizza() {       
 // this("small", 0, 0, 0);//this statement is also be written
//}

    public double calcost()
    {
        double cost=0;
        switch (size.toLowerCase()) {
           
             case "small" -> cost=10;
                 case "medium" -> cost=12;
                 case "large" -> cost=15;
            default -> throw new IllegalArgumentException("invalid pizza size");
                       
        }
        cost+=(cheesetopins+ pepperonitopins+hamtopins )*2;
        return cost;
        
    }
    public  String getdiscription()
    {
        return "pizza size"+size+",cheesetopins"+cheesetopins+",peppronitopins"+pepperonitopins+",hamtopins"+hamtopins+"cost="+calcost();
    }
   
}
