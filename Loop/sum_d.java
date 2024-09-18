package loop;
import java.util.Scanner;
class sum_d
{
    public static void main (String args[])
    {
        Scanner in=new Scanner (System.in);
        int i,n,ag,sum=0;
        System.out.println("Enter n=");
        n=in.nextInt();
        for (i=9;i<=n;i=i+1)
        {
            sum=sum+i+((i*10)+9);
        }
        System.out.println(sum);
    }
}