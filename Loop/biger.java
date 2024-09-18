package loop;
import java.util.Scanner;
class biger
{
    public static void main (String args[])
    {
        Scanner in=new Scanner (System.in);
        int a,b,sum=0;
        System.out.println("A=");
        a=in.nextInt();
        System.out.println("B=");
        b=in.nextInt();
        while(a>0)
        {
            b=a%10;
            sum=sum+b;
            a=a/10;
        }
        System.out.println(sum);
    }
}