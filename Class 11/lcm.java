/*formola for lcm is
 * a*b=hcf*lcm;
 * lcm=a*b/hcf;
 */
import java.util.Scanner;
class lcm
{
    public static void main(String[]args)
    {
        int a,b,i,x,lcm=0,hcf=0;
        Scanner in=new Scanner(System.in);
        System.out.println("A=");
        a=in.nextInt();
        System.out.println("B=");
        b=in.nextInt();
        x=a*b;
        for(i=1;i<=x;i++)
        {
            if(a%i==0 && b%i==0)
            {
                hcf=i;
            }
            lcm=(a*b)/hcf;
        }
       // lcm=(a*b)/hcf;
        System.out.println("LCM IS= "+lcm);
    }
}