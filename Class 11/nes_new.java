/* n=5
   *********
   **** ****
   ***   ***
   **     **
   *       *
*/
import java.util.Scanner;
class nes_new
{
    public static void main(String[]args)
    {
        int i,j,k,l,n;
        Scanner a=new Scanner (System.in);
        System.out.println("N=");
        n=a.nextInt();
        l=n;
        for (i=n;i>=1;i--)
        {
            for(j=1;j<=n*2-1;j++)
            {
                if(i>=j||l<=j)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            l++;
            System.out.println("");
        }
    }
}