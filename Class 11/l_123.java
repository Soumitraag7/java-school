import java.util.Scanner;
class l_123
{
    public static void main(String[]args)
    {
        int i,j,n;
        Scanner in=new Scanner (System.in);
        System.out.println("ENTER THE NO OF LINES YOU WANT");
        n=in.nextInt();
        for (i=1;i<=n;i++)
        {
            for (j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}