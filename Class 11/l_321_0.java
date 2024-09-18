/* n=5
   1
   21
   321
   4321
   54321 */
import java.util.Scanner;
class l_321_0
{
    public static void main(String[]args)
    {
        int i,j,n,c=0,x=0;
        Scanner in=new Scanner (System.in);
        System.out.println("ENTER THE NO OF LINES YOU WANT");
        n=in.nextInt();
        for (i=1;i<=n;i++)
        {
            for (j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}