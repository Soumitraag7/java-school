import java .util.*;
class loop_square2
{
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        double i,n,sum=0;
        System.out.print("Enter the value of n :");
        n=in.nextInt ();
        for (i=1;i<=n;i++)
        {
            sum=sum+Math.pow(i,i);
        }
        System.out.print(sum);
    }
}
            