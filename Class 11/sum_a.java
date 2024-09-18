 
import java.util.Scanner;
class sum_a
{
    public static void main (String args[])
    {
        Scanner in=new Scanner (System.in);
        int i, sum=0;
        int n;
        System.out.println("Enter n=");
        n=in.nextInt();
        for (i=9; i>=n ; i--)
        {
            sum=sum+i+(i*10)+9;
        }
            System.out.println(sum);
    }
}