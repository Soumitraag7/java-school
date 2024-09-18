package loop;
import java.util.Scanner;
class armgstrong
{
    public static void main (String args[])
    {
        Scanner in=new Scanner (System.in);
        int a,b,sum=0,c=0;
        System.out.println("Enter A=");
        a=in.nextInt();
        a=c;
        while(a>0)
        {
            b=a%10;
            sum=sum+b*b*b;
            a=a/10;
        }
        if (c==sum)
        {
            System.out.println("Its a armgstrong no");
        }
        else
        {
            System.out.println("Its not a armgstrong no");
        }
    }
}