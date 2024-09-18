package if_else;
import java.util.Scanner;
class jh_2
{
    public static void main (String args[])
    {
        int a,b,c;
        Scanner in=new Scanner (System.in);
        System.out.println("CALCULITING THE BILL FOR YOUR DISTANCE TRAVELLED");
        System.out.println("ENTER YOUR DISTANTE TRAVELED(in km/hr)= ");
        a=in.nextInt();
        if (a>=1 && a<=6)
        {
            System.out.println("YOU HAVE TO PAY Rs10");
        }
        else if (a>6 && a<=12)
        {
            System.out.println("YOU HAVE TO PAY Rs15");
        }
        else if (a>12 && a<=18)
        {
            System.out.println("YOU HAVE TO PAY Rs20");
        }
        else
        {
            System.out.println("YOU HAVE TO PAY Rs25");
        }
    }
}