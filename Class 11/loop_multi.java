import java .util.*;
class loop_multi
{
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        double i,n,sum=0,x;
        System.out.print("Enter the value of x :");
        x=in.nextInt ();
        System.out.print("Enter the value of n :");
        n=in.nextInt ();
        for (i=1;i<=n;i++)
        {
            sum=sum+(x/i);
        }
        System.out.print(sum);
    }
}
            