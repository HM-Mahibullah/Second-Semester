
package labproblem_8;


public class test {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int space=1;space<=n-i;space++)
            {
                System.out.print(" ");
            }
            for(char j='A';j<(char)('A'+i);j++)
            {
                System.out.print(j);
            }
            for(char j=(char)('A'+i-2);j>='A';j--)
            {
                System.out.print(j);
            }
            System.out.println(" ");
        }
        for(int i=n-1;i>=1;i--)
        {
            for(int space=1;space<n-i;space++)
            {
                System.out.print(" ");
            }
            for(char j='A';j<(char)('A'+i);j++)
            {
                System.out.print(j);
            }
            for(char j=(char)('A'+i-2);j>='A';j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
