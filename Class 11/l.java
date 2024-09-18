import java.util.Scanner;
class l
{
    public static void main(String [] args)
    {
        int a,b,arm=0,d;
        Scanner in=new Scanner(System.in);
        System.out.println("A=");
        a=in.nextInt();
        d=a;
        while(a>0)
        {
            b=a%10;
            a=a/10;
            arm=arm+b*b*b;
        }
        if (arm==d)
        {
           System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}