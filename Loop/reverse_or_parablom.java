package loop;
import java.util.Scanner;
class reverse_or_parablom
{
    public static void main(String[]args)
    {
       int b,c,n,i;
       int a=0,a1=0,rev=0;
       Scanner in=new Scanner (System.in);
       System.out.println("N=");
       n=in.nextInt();
       for (i=1;i<=n;i++)
       {
           if (n%i==0)
           {
               a++;
           }
       }
       if (a==2)
       {
           while(n>0)
           {
               b=n%10;
               rev=rev*10+b;
               n=n/10;
           }
           for(i=1;i<=rev;i++)
           {
               if (rev%i==0)
               {
                   a1++;
               }
           }
       }
       if (a==a1)
       {
           System.out.println("IT IS A TWISTED PRIME NO");
       }
       else
       {
           System.out.println("IT NOT A TWISTED PRIME NO");
       }
    }
}