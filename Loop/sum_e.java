package loop;
import java.util.Scanner;
class sum_e
{
    public static void main (String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,n,sum=1;
        System.out.println("Enter n=");
        n=in.nextInt();
        for (i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("Ans= "+sum);
    }
}