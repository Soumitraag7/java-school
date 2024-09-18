import java .util.*;
class while_fact
{
    public static void main (String args [])
    {
        Scanner in = new Scanner (System.in);
        int a,i=1;
        System.out.println ("Enter the number :");
        a=in.nextInt();
        while (i>=a)
        {
            if (a%i==0)
            {
                System.out.println("The factors are :"+i);
            }
        }
    }
}