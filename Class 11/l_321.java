/*n=5
  12345
  1234
  123
  12
  1  */
import java.util.Scanner;
class l_321
{
    public static void main(String[]args)
    {
        int i,j,n,x;
        Scanner in=new Scanner (System.in);
        System.out.println("ENTER THE NO OF LINES YOU WANT");
        n=in.nextInt();
        for (i=n;i>=1;i--)
        {
            for (j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}