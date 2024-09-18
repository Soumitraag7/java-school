/* n=5
   *****
    ****
     ***
      **
       *
*/
import java.util.*;
class nes_star_mirror
{
    public static void main (String[]args)
    {
        int i,j,n;
        Scanner in=new Scanner(System.in);
        System.out.println("N=");
        n=in.nextInt();
        for (i=1;i<=n;i++)
        {
            for (j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            for (j=i;j<=n;j++)
            {
                System.out.print("*");//or print j
            }
            System.out.println("");
        }
    }
}