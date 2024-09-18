package loop;
import java.util.*;
class nes4
{
    public static void main(String []args)
    {
        int n,i,j;
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the number of lines you want=");
        n=a.nextInt();
        for (i=1;i<=n;i++)
        {
            for (j=1;j<=n;j++)
            {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}