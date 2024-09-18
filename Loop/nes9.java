package loop;
import java.util.*;
class nes9
{
    public static void main(String [] args)
    {
        int i,j,k,n,z;
        Scanner a=new Scanner (System.in);
        System.out.println("Enter the number of lines you want=");
        n=a.nextInt();
        for (i=1;i<=n;i++)
        {
            for (j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (k=1;k<=n;k++)
        {
            for (int l=k;l<n;l++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}