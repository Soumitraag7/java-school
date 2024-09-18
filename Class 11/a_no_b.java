import java.util.Scanner;
class a_no_b
{
    public static void main (String args[])
    {
        int a,b,sq,cb;
        Scanner in=new Scanner (System.in);
        System.out.println("ENTER 1ST NO");
        a=in.nextInt();
        System.out.println("ENTER 2ND NO");
        b=in.nextInt();
        if (a!=b)
        {
            if (a<b)
            {
                sq=a*a;
                cb=b*b*b;
            }
            else
            {
                sq=b*b;
                cb=a*a*a;
            }
                System.out.println("THE SQUARE OF SMALL NO "+sq);
                System.out.println("CUBE OF THE GREATER NO "+cb);
        }
        else
        {
            System.out.println("A=B");
        }
    }
}