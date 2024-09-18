package loop;
import java.util.*;
class nes16
{
    public static void main(String[]args)
    {
        int i,j,k,n,l=0;
        int z=0;
        Scanner a=new Scanner (System.in);
        System.out.println("Enter the number of lines you want=");
        n=a.nextInt();
        l=n;
        for(i=n;i>=1;i--)
        {
            for(j=1;j<=n*2-1;j++)
            {
                if(j>=i||l<=n*2-1)
                {
                   System.out.print("*");
                }
                else
                {
                   System.out.print(" ");
                }
            }
            l++;
            System.out.println("");
        }
    }
}