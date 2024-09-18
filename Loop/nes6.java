package loop;
import java.util.*;
class nes6
{
    public static void main(String []args)
    {
        int n,i,j;
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the number of lines you want=");
        n=a.nextInt();
        for (i=n;i>=1;i--)
        {
            for (j=n;j>=i;j--)
            {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}