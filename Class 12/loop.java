/*
Enter the no of line's you want to print
4
*
**
***
****
* 
*/
import java.util.Scanner;
class loop
{
    public static void main(String [] args)
    {
        int n,i,j;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the no of line's you want to print");
        n=in.nextInt();
        for (i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}