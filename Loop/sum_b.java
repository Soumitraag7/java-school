package loop;
import java.util.Scanner;
class sum_b
{
    public static void main (String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,n,sum=0;
        System.out.println("Enter n=");
        n=in.nextInt();
        for (i=1;i<=n;i=i+2)
        {
            sum=sum+i;
        }
        System.out.println("Ans= "+sum);
        //System.out.println(sum);
    }
}
