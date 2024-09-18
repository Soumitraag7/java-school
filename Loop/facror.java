package loop;
import java.util.Scanner;
class facror
{
    public static void main (Scanner args[])
    {
        Scanner in=new Scanner (System.in);
        int a,sum=1,i;
        System.out.println("A=");
        a=in.nextInt();
        while(a>=1)
        {
            sum=sum*a;
            a--;
        }
        System.out.println("Factoril="+sum);
    }
}