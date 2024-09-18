package loop;
import java.util.Scanner;
class sum2
{
    public static void main(String[]args)
    {
        int n,sum=1;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter N=");
        n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            sum=sum*i;
        }
        System.out.println(sum);
    }
}