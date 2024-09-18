import java .util.*;
class neon_number
{
    public static void main (String args [])
    {
        Scanner in = new Scanner (System.in);
        int a,i,sq,sum=0;
        System.out.println ("Enter the number :");
        a=in.nextInt();
        int c=a;
        while (a>0)
        {
            i=a%10;
            sq=a*a;
            a=sq/10;
            sum=sq+a;
        }
        if (sum==c)
        {
            System.out.print ("it is a neon number");
        }
        else
        {
            System.out.print ("it is not a neon number");
        }
    }
}
                  
        