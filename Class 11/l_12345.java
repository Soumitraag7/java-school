import java.util.Scanner;
class l_12345
{
    public static void main(String[]args)
    {
        int i,j,n,x;
        Scanner in=new Scanner (System.in);
        System.out.println("ENTER THE NO OF LINES YOU WANT");
        n=in.nextInt();
        x=n+2;
        for (i=1;i<=n;i++)
        {
            for (j=1;j<=x;j++)
            {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}