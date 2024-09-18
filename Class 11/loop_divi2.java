import java .util.*;
class loop_divi2
{
    public static void main (String args[])
    {
        Scanner in = new Scanner (System.in);
        double i,n,sum=1,x;
        System.out.print("Enter the value of x :");
        x=in.nextInt ();
        System.out.print("Enter the value of n :");
        n=in.nextInt ();
        for (i=2;i<=n;i++)
        {
            sum=sum+x/Math.pow(i,i-1);
        }
        System.out.print(sum);
    }
}
            