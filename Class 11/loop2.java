import java .util.*;
class loop2
{
    public static void main (String args [])
    {
        Scanner in = new Scanner (System.in);
        int n,sum=0,i;
        System.out.print ("Enter the value of n :");
        n=in.nextInt();
        for (i=2;i<=n;i=i+2)
        {
            sum=sum+i;
        }
        System.out.print(sum);
    }
}