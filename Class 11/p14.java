import java .util.*;
class p14
{
    public static void main (String args [])
    {
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=9;j++)
            {
               if(j<=6-i||j>=4+i)
                {
                System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i=5;i>=1;i--)
        {
            for (int j=1;j<=9;j++)
            {
               if(j>=4+i||j<=6-i)
                {
                System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
        
                
            
     