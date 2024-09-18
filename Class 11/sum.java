/*Q:
 * s=(a+1/2)+(a+3/4)+(a+5/6)+....+(a+n/n+1)
 */
import java.util.Scanner;
class sum
{
    public static void main(String[]args)
    {
        int a,s=0,i,c=2;
        Scanner in=new Scanner(System.in);
        System.out.println("A=");
        a=in.nextInt();
        for(i=1;i<=a;i+=2)
        {
            s=s+(a+i/c);
            c=c+2;
        }
        System.out.println("Total= "+s);
    }
}