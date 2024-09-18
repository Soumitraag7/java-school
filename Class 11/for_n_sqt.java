package loop;
import java.util.Scanner;
class for_n_sqt
{
    public static void main (String args[])
    {
        Scanner in=new Scanner (System.in);
        double i, sum=0;
        int n;
        System.out.println("Enter n=");
        n=in.nextInt();
        for (i=1; i<=n ; i++)
        {
            sum=sum+Math.pow(i,i);
        }
            System.out.println(sum);
    }
}