package while_statement;
import java.util.Scanner;
class rev
{
    public static void main (String args[])
    {
        Scanner in=new Scanner (System.in);
        int a,b,rev=0;
        System.out.println("Enter the 3 digit no");
        a=in.nextInt();
        while(a>0)
        {
            b=a%10;
            rev=rev*10+b;
            a=a/10;
        }
        System.out.println("Reverse of the no");
        System.out.println(rev);
    }
}