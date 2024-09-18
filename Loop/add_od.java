package loop;
import java.util.Scanner;
class add_od
{
    public static void main (String []args)
    {
        int i,a,b,sum=0,c=1,d=1;
        Scanner in=new Scanner (System.in);
        System.out.println("ENTER A >=2");
        a=in.nextInt();
        for(i=1;i<=a;i++)
        {
            d=d+c;
            c=c+2;
            sum=sum+d;
        }
        System.out.println(sum);
    }
}