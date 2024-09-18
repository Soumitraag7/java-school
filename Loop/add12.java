package loop.while_statement;
import java.util.Scanner;
class add12
{
    public static void main (String args[])
    {
        Scanner in=new Scanner (System.in);
        int a,b,c=0;
        System.out.println("Addind 1st nd 2nd no");
        a=in.nextInt();
        while(a>0)
        {
            b=a%10;
            c=c+b;
            a=a/100;
        }
        System.out.println(c);
    }
}