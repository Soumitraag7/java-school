package loop;
import java.util.Scanner;
class for_n_add
{
    public static void main (String args[])
    {
        Scanner in=new Scanner (System.in);
        int i, sum=0;
        int n;
        System.out.println("Enter n=");
        n=in.nextInt();
        for (i=1 ; i<=n ; i++)
        {
            sum=sum+(i+2);
        }
            System.out.println(sum);
    }
}