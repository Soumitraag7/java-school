
import java.util.Scanner;
class sum_f
{
    public static void main (String args[])
    {
        Scanner in=new Scanner (System.in);
        double i=1 , j=2 , sum=0;
        double n;
        System.out.println("Enter n=");
        n=in.nextInt();
        for (i=1 ; i<=n ; i++)
        {
           sum=sum+(i+j)/((i+1)*(j+1));
           j++;
        }
           System.out.println("Ans="+sum);
        }
    }