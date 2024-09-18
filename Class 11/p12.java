import java.util.*;
class p12
{
    public static void main (String args[])
    {
        Scanner in=new Scanner(System.in);
        int space=0,star=7;
        int n;
        System.out.println ("Enter the number of rows :");
        n=in.nextInt();
        for (int i=1;i<n;i++)
        {
            int t=i;
            for (int j=0;j<=space;j++)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=star;k++)
            {
                System.out.print("*");
               
            }
            space++;
            star=star-2;
            System.out.println ();
        }
    }
}
                
            
            
    