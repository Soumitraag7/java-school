/*
Enter the no of lines u want
5

1
22
333
4444
55555
*/
import java.util.Scanner;
class loop2
{
    public static void main(String [] args)
    {
        int n,i,j;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter the no of lines u want");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}