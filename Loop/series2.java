package loop;
import java.util.Scanner;
class series2
{
    public static void main(String[]args)
    {
        double a,i,sum=0.0,n,b=1.0,c=1.0;
        Scanner in=new Scanner(System.in);
        System.out.println("A=");
        a=in.nextDouble();
        System.out.println("ENETER THE NO IN THE SEARIS");
        n=in.nextDouble();
        for(i=1;i<=n;i++)
        {
            if(i%2==0)
            {
              sum=sum-(Math.pow(a,b)/c);
              b=b+2;
              c=c+4;
            }
            else
            {
                sum=sum+(Math.pow(a,b)/c);
                b=b+2;
                c=c+4;
            }
        }
        System.out.println("Ans= "+sum);
        //System.out.println(i);
    }
}