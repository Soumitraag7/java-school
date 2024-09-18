/*recusive function
 * 
 * output:
 * 

Enter a no
4
Ans= 24

 * 
 */
import java.util.Scanner;
class com
{
    int compute(int n)
    {
        if (n==1)
        {
           return (1);
        }
        else
        {
           return(n*compute(n-1));
        }
    }
    public static void main (String [] args)
    {
        int n1;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter a no");
        n1=in.nextInt();
        com ob=new com();
        int k=ob.compute(n1);
        System.out.println("Ans= "+k);
    }
}