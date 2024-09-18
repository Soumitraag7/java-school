package loop;
import java.util.Scanner;
class sum4
{
    public static void main(String[]args)
    {
        int n;double sum=0;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter N=");
        n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            sum=sum+(Math.pow(i,2));
        }
        System.out.println(sum);
    }
}