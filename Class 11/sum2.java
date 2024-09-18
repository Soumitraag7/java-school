/*Q:
 * s=(1/2)-(2/3)+(3/4)-(4/5)+....(n/n+1)
 */
import java.util.Scanner;
class sum2
{
    public static void main(String[]args)
    {
        int n,s=0,i;
        Scanner in=new Scanner(System.in);
        System.out.println("N=");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                s=s+(i/i+1);
            }
            else
            {
                s=s-(i/i+1);
            }
            System.out.println("Total= "+s);
        }
    }
}