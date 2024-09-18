package loop;
import java.util.Scanner;
class A2
{
    public static void main(String[]args)
    {
        int a,n,i,b=0;
        double s=0.0;
        Scanner in=new Scanner (System.in);
        System.out.println("ENTER A=");
        a=in.nextInt();
        System.out.println("ENTER N=");
        n=in.nextInt();
        for (i=1;i<=n;i++)
        {
            //s=s+(1.0/i);
            if (i%2==0)
            {
                s=s+(Math.pow(a,i));
            }
            else
            {
                s=s-(Math.pow(a,i));
            }
        }
        System.out.println(s);
    }
}