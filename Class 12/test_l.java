import java.util.Scanner;
class test_l
{
    public static void main(String [] args)
    {
        int n;
        int s1=0;
        int sum=1;
        Scanner in=new Scanner(System.in);
        System.out.println("N=");
        n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            sum=sum*i;
            s1=s1+sum;
        }
        System.out.println("Sum= "+s1);
    }
}