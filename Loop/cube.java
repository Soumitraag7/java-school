package loop.while_statement;
import java.util.Scanner;
class cube
{
    public static void main (String args[])
    {
        Scanner in=new Scanner (System.in);
        int a,b,c=0;
        System.out.println("Enter the no");
        a=in.nextInt();
        while(a>0)
        {
            b=a%10;
            c=c+(b*b*b);
            a=a/10;
        }
        System.out.println(c);
    }
}