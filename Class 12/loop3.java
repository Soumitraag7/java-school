/*
Enter the no of line you want
5

*****
****
***
**
*

*/
import java.util.Scanner;
class loop3
{
    public static void main(String [] args)
    {
        int n,i,j;
        Scanner in=new Scanner (System.in);
        System.out.println("Enter the no of line you want");
        n=in.nextInt();
        for(i=n;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}