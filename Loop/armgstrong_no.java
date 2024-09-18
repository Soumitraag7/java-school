package loop;
import java.util.*;
class armgstrong_no
{
    public static void main(String[] args)
    {
        int a,b,c;
        double sum=0.0;
        Scanner in=new Scanner (System.in);
        System.out.println("A=");
        a=in.nextInt();
        c=a;
        while(a>0)
        {
            b=a%10;
            a=a/10;
            sum=sum+Math.pow(b,3);
        }
        if (sum==c)
        {
            System.out.println("IT IS A ARMGSTRONG NO");
        }
        else
        {
            System.out.println("IT IS NOT A ARMGSTRONG NO");
        }
    }
}