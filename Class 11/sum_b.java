package loop;
import java.util.Scanner;
class sum_b
{
    public static void main (String args[])
    {
        Scanner in=new Scanner (System.in);
        int i , sum=1;
        int n;
        System.out.println("Enter n=");
        n=in.nextInt();
        for (i=1 ; i<=n ; i++)
        {
            sum=sum+i;
        }
        System.out.println("Answer= "+sum);
    }
}