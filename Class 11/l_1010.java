import java.util.Scanner;
class l_1010
{
    public static void main(String[]args)
    {
        int i,j,n,x=1;
        Scanner in=new Scanner (System.in);
        System.out.println("ENTER THE NO OF LINES YOU WANT");
        n=in.nextInt();
        for (i=1;i<=n;i++)
        {
            for (j=1;j<=i;j++)
            {
                if (j%2==0)
                {
                   System.out.print("0");
                }
                else
                {
                    System.out.print("1");
                }
            }
            System.out.println("");
        }
    }
}