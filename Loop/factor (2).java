package while_statement;
import java.util.Scanner;
class factor
{
    public static void main (String args[])
    {
        Scanner in=new Scanner (System.in);
        int a,n=1,sum=0;
        System.out.println("Enter a number");
        a=in.nextInt();
        while(n<a)
        {
            if(a%n==0)
            {
                sum=sum+n;
                // System.out.println(n);
            }
            n++;
        }
        if (sum==a)
        {
        System.out.println("perfect no");
    }
    else
    {
        System.out.println("not pro no");
    }
    }
}