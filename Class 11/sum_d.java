 
import java.util.Scanner;
class sum_d
{
    public static void main (String args[])
    {
        Scanner in=new Scanner (System.in);
        int i=1,j=2, sum=0;
        int n;
        System.out.println("Enter n=");
        n=in.nextInt();
        for (j=2 ; j<=n ; j++)
        {
            sum=sum+(i*j);
            i++;
        }
        System.out.println("Ans= "+sum);
    }
}