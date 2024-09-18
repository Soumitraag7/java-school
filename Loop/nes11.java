package loop;
import java.util.*;
class nes11
{
    public static void main (String[]args)
    {
        int i,j,n;
        Scanner a=new Scanner (System.in);
        System.out.println("Enter the number of lines you want=");
        n=a.nextInt();
        for (i=n;i>=1;i--)
        {
            for (j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}