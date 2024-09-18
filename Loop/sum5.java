package loop;
import java.util.Scanner;
class sum5
{
    public static void main(String[]args)
    {
        int n,b=2;
        double sum=0;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter N=");
        n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            sum=sum+(Math.pow(i,b));
            b=b+1;
        }
        System.out.println(sum);
    }
}