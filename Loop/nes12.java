package loop;
import java.util.*;
class nes12
{
    public static void main(String[]args)
    {
        int i,j,k,n;
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the number of lines you want=");
        n=a.nextInt();
        for (i=1;i<=n;i++)
        {
            for (j=1;j<=i;j++)
            {
                if (j%2==0)
                {
                    System.out.print("#");
                }
                else
                {
                   System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}