package loop;
import java.util.*;
class for_nat
{
    public static void main(String []args)
    {
        int a,i,b=0;
        Scanner in=new Scanner (System.in);
        System.out.println("ENTER A=");
        a=in.nextInt();
        for (i=1;i<=a;i++)
        {
            b=b+i;
        } 
        System.out.println("\nTHE SUM= "+b);
    }
}