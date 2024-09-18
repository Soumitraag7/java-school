import java.util.Scanner;
class seri
{
    public static void main(String[]args)
    {
        int i,j,n,sum=1,x=1;
        Scanner in=new Scanner (System.in);
        System.out.println("ENTER THE NO OF LINES YOU WANT");
        n=in.nextInt();
        for (i=1;i<=n;i++)
        {
            for (j=1;j<=i;j++)
            {
                System.out.print(i);//or sum as output/i is out of the loop so it will also work
            }
            //sum++;
            System.out.println("");
        }
    }
}