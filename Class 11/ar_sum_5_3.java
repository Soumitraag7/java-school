import java.util.Scanner;
class ar_sum_5_3
{
    public static void main (String[]args)
    {
        int a[]=new int [10];
        int sum=0,x=1;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter 10 no=");
        for (int i=0;i<=9;i++)
        {
            a[i]=in.nextInt();
            if (a[i]%3==0 || a[i]%5==0)
            {
                sum=sum+a[i];
            }
            x++;
        }
        System.out.println("Sum= "+sum);
    }
}