package loop;
import java.util.Scanner;
class parablome
{
    public static void main(String args[])
    {
        Scanner in=new Scanner (System.in);
        int a=0,b,c,rev=0;
        System.out.println("A=");
        c=in.nextInt();
        a=c;
        while(a>0)
        {
            b=a%10;
            rev=rev*10+b;
            a=a/10;
        }
        System.out.println(rev);
        if(c==rev)
        {
            System.out.println("Parablome");
        }
        else
        {
            System.out.println("Not Parablome");
        }
    }
}