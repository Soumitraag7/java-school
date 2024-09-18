import java .util.*;
class p17
{
    public static void main (String args [])
    {
        int space=8,star=1;
        for (int i=1;i<=5;i++)
        {
            for (int j=7;j<=space;j++)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=star;k++)
            {
                System.out.print(i);
            }
            space--;
            star+=2;

        }
        for (int i=7;i>=0;i--)
        {
            for (int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=star;k++)
            {
                System.out.print(i);
            }
            space++;
            star-=2;
            System.out.println ();
        }
    }
}
           
            
            