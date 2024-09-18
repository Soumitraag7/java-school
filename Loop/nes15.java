package loop;
import java.util.*;
class nes15
{
    public static void main(String[]args)
    {
        int i,j,k,l;
        int n;
        Scanner a=new Scanner (System.in);
        System.out.println("Enter the number of lines you want=");
        n=a.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=n;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(k=2;k<=n;k++)
        {
            for(l=1;l<=k;l++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}