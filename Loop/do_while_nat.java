package loop;
import java.util.*;
class do_while_nat
{
    public static void main(String []args)
    {
        int a,i=1,b=0;
        Scanner in=new Scanner (System.in);
        System.out.println("ENTER A=");
        a=in.nextInt();
        do
        {
            b=b+i;
            i++;
        }
        while(i<=a);
        System.out.println("\nTHE SUM= "+b);
    }
}