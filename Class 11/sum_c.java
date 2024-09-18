package loop;
import java.util.Scanner;
class sum_c
{
    public static void main (String args[])
    {
        Scanner in=new Scanner (System.in);
        int i, sum=0;
        int n;
        System.out.println("Enter n=");
        n=in.nextInt();
        for (i=4 ; i<=n ; i=-i*2)
        {
            sum=sum+i;
        }
        System.out.println("Ans= "+sum);
    }
}