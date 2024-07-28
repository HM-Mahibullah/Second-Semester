
package _2;

public class Subclass extends Superclass {
private int data2;
    public Subclass(int data1,int data2)
    {
        super(data1);
        this.data2=data2;
        
    }
    public int  getData2()//also can be written getdata2().
    {
        return data2;
    }
    public void  setData2(int data2)//also can be written setdata2().
    {
        this.data2=data2;
    }
    public String checkcondition()
    {
           if (getData1() == 10 && getData2() == 15) {    
         return "Condition True!";
           }
           else
           {
               return "condition False!";
           }
    }

  
    
    
    
    
    
}
