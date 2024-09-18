package loop;
import java.util.Scanner;
class smalest
{
    public static void main (String args[])
    
    {
        Scanner in=new Scanner(System.in);
        int a,b,min;
        System.out.println("Enter A=");
        a=in.nextInt();
        min=a%10;
        while(a>0)
        {
            b=a%10;
            if (b<=min)
            {
                min=b;
            }
            a=a/10;
        }
        System.out.println("Smalest no= "+min);
    }
}