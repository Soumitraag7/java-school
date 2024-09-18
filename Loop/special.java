package loop;
import java.util.Scanner;
class special
{
    public static void main (Scanner args[])
    {
        Scanner in=new Scanner (System.in);
        int a,add9,b,c,mul,add;
        System.out.println("A=");
        a=in.nextInt();
        b=a%10;
        c=a/10;
        mul=b*c;
        add=b+c;
        add9=mul+add;
        if(add9==a)
        {
          System.out.println("its a special no");
        }
        else
        {
          System.out.println("its not a special no");
        }
   }
}