package loop;
import java.util.Scanner;
class sum_c
{
    public static void main (String args[])
    {
        Scanner in=new Scanner (System.in);
        double i,n,sum=0;
        System.out.println("Enter n=");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            sum=sum+Math.pow(i,i);
        }
        System.out.println(sum);
    }
}
   