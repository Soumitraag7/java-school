package loop;
import java.util.Scanner;
class sum3
{
    public static void main(String[]args)
    {
        int n,b=4;
        double sum=0;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter N=");
        n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            sum=sum+(1.0/b);
            b=b+4;
        }
        System.out.println(sum);
    }
}