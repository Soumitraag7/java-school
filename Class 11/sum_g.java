package loop;
import java.util.Scanner;
class sum_g
{
    public static void main (String args[])
    {
        Scanner in=new Scanner (System.in);
        double i=1 , sum=0;
        double n,a;
        System.out.println("Enter n= ");
        n=in.nextInt();
        System.out.println("Enter a= ");
        a=in.nextDouble();
        for (i=1  ; i<=n ; i++)
        {
            sum=sum+(i/Math.pow(a,a));
            a++;
        }
        System.out.println("Ans= "+sum);
    }
}