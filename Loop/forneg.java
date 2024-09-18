package loop;
import java.util.Scanner;
class forneg
{
    public static void main(String[]args)
    {
        int n,i,b=0;
        double s=0.0;
        Scanner in=new Scanner (System.in);
        System.out.println("ENTER N=");
        n=in.nextInt();
        for (i=2;i<=n;i++)
        {
            //s=s+(1.0/i);
            if (i%2!=0)
            {
                s=s+(1.0/i);
            }
            else
            {
                s=s-(1.0/i);
            }
        }
        System.out.println(s);
    }
}