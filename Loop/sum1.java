package loop;
import java.util.Scanner;
class sum1
{
    public static void main(String[]args)
    {
        int n,sum=0;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter N=");
        n=in.nextInt();
        for(int i=2;i<=n;i+=2)
        {
            sum=sum+i;
        }
        System.out.println(sum);
    }
}