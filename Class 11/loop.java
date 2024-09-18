import java .util.*;
class loop
{
    public static void main (String args [])
    {
        Scanner in = new Scanner (System.in);
        int i,fact=1;
        for (i=1;i<=6;i++)
        {
            fact=fact*i;
        }
        System.out.print(fact);
    }
}