package loop;
import java.util.Scanner;
class twiested_prime_no
{
    public static void main(String [] args)
    {
        int n,c=0,s=0,d=0;
        Scanner in=new Scanner (System.in);
        System.out.println("n=");
        n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            /*c=c%10;
            s=s*10+c;*/
            if (n%i==0)
            {
                c++;
            }
        }
        if (c==2)
        {
            for(int i=1;i<=n;i++)
           {
            n=n%10;
            s=s*10+n;
            if (s%i==0)
            {
                d++;
            }
           }
        }
        if(d==2)
        {
            System.out.println("IT IS A TWISTED PRIME NO");
        }
        else
        {
            System.out.println("IT IS NOT A PRIME NO");
        }
    }
}