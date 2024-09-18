import java.util.Scanner;
class comission
{
    public static void main (String [] args)
    {
        float a,b;
        Scanner in=new Scanner (System.in);
        System.out.println("ENTER THE AMOUNT OF SELL TO KNOW YOUR COMISSION");
        a=in.nextFloat();
        if (a>=0 && a<=999)
        {
            b=(a*3)/100;
            System.out.println("YOUR COMISSION OF 3%= "+b);
        }
        else if (a>=1000 && a<=9999)
        {
            b=(a*9)/100;
            System.out.println("YOUR COMISSION OF 9%= "+b);
        }
        else if(a>=10000)
        {
            b=(a*12)/100;
            System.out.println("YOUR COMISSION OF 12%= "+b);
        }
        else if(a<=-1)
        {
            System.out.println("WRONG INPUT");
        }
    }
}