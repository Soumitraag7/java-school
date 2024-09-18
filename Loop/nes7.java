package loop;
import java.util.*;
class nes7
{
    public static void main(String []args)
    {
        int n,i,j;
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the number of lines you want");
        n=a.nextInt();
        for (i=1;i<=n;i++)
        {
            for (j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for (int k=n;k>=j;k--)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}