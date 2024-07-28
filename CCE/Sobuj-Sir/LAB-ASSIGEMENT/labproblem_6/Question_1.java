
package labproblem_6;

public class Question_1 {
    public static void main(String[] args) {
        
    
    int a[]={10, 40, 3, 4, 5, 6, 7, 20,20,20, 3, 10};
int c_1=0,c_2=0;
for(int b:a)
{
    if(b==10)
    
        c_1++;
    
    else if(b==20)
                
                c_2++;
                
}
if(c_1>c_2)
{
    System.out.print("the number 10 is grater than 20");
}
else if(c_1<c_2)
{
    System.out.print("The number is 20 than greater 10");
}
else if(c_1==c_2)
{
    System.out.print("number is equal");
}
else
{
    System.out.print("EQUAL");
}
    
}
}
