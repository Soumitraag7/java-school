package loop;
import java.util.Scanner;
class sum6
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
            if (i%2==0)
            {   
                sum=sum-i;
            }
            else
            {
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}