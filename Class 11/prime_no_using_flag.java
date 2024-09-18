import java.util.Scanner;
class prime_no_using_flag
{
    public static void main (String[]args)
    {
        int n,i,flag=0;
        Scanner in=new Scanner(System.in);
        System.out.println("N=");
        n=in.nextInt();
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                flag=1;
            }
        }
        if(flag==0)
        {
            System.out.println("IT'S A PRIME NO");
        }
        else
        {
            System.out.println("IT'S NOT A PRIME NO");
        }
    }
}