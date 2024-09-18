/*n=5
  1	
  2	  3	
  4	  5	  6	
  7	  8	  9	 10	
  11  12  13 14	 15*/
import java.util.Scanner;
class l_23
{
    public static void main(String[]args)
    {
        int i,j,n,x=1;
        Scanner in=new Scanner (System.in);
        System.out.println("ENTER THE NO OF LINES YOU WANT");
        n=in.nextInt();
        for (i=1;i<=n;i++)
        {
            for (j=1;j<=i;j++)
            {
                System.out.print(x+"\t");
                x++;
            }
            System.out.println("");
        }
    }
}