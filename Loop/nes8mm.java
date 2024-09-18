package loop;
import java.util.*;
class nes8mm
{
    public static void main(String [] args)
    {
        int i,j,k,n,z;
        Scanner a=new Scanner (System.in);
        System.out.println("Enter the number of lines you want=");
        n=a.nextInt();
        for (i=n;i>=1;i--)
        {
            for (j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}