import java .util.*;
class armstrong_number
{
    public static void main (String args [])
    {
        Scanner in = new Scanner (System.in);
        int a,i=1,sum=0,c;
        System.out.println ("Enter the number :");
        i=in.nextInt();
        c=i;
        while (i>0)
        {
            a=i%10;
            sum=sum+a*a*a;
            i=i/10;
        }
        if (sum==c)
        {
        System.out.println ("This is a armstrong number");}
        else 
        {
        System.out.println ("This is not a armstrong number");
    }
}
}
        