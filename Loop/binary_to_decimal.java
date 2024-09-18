package loop;
import java.util.*;
class binary_to_decimal
{
    public static void main(String[]args)
    {
        int a,n,b,i=0,z=0;
        int sum=0;
        Scanner in=new Scanner (System.in);
        System.out.println("ENTER A BINARY NO");
        a=in.nextInt();
        n=a;
        while (a>0)
        {
            b=a%10;
            a=a/10;
            if (b!=0 && b!=1)
            {
                z=1;
            }
        }
        if (z==0)
        {
        while(n>0)
        {
            b=n%10;
            sum=sum+((int)Math.pow(2,i)*b);
            n=n/10;
            i++;
            //System.out.println(sum);
        }
        System.out.println(sum);
       }
       else
       System.out.println("ITS NOT A BINARY NO");
    }
}